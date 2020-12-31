### 1、简述说明
车金融力蕴公共枚举、常量、入参DTO的统一集中管理，通过maven依赖引入；也是对Boss团队、渠道以及其他相关团队公共定义的API管理。
```xml
<dependency>
    <groupId>com.lyqc.base</groupId>
    <artifactId>lyqc-base</artifactId>
    <version>1.4.10-SNAPSHOT</version>
</dependency>
```
### 2、目录划分
#### 2.1、base
相关公共枚举、entity，分页对象等
#### 2.2、contract
所属lyqc-css应用，维护相关枚举，DTO对象等。
#### 2.3、gpsprovider
所属gps-provider应用，维护相关枚举，DTO对象等。
#### 2.4、gpsweb
所属gps-web应用，维护相关枚举，DTO对象等。
#### 2.5、hades
所属car-hades应用，维护相关枚举，DTO对象等。
#### 2.6、handshake
所属car-handshake应用，维护相关枚举，DTO对象等。
#### 2.7、heil
所属car-heil应用，维护相关枚举，DTO对象等。
#### 2.8、poseidon
所属car-poseidon应用，维护相关枚举，DTO对象等。
#### 2.9、product
所属car-product应用，维护相关枚举，DTO对象等。
#### 2.10、receiveorder
所属car-yvlv应用，维护相关枚举，DTO对象等。
#### 2.11、seig
所属lyqc-seig应用，维护相关枚举，DTO对象等。
#### 2.12、yy
所属lyqc-yy应用，维护相关枚举，DTO对象等。
#### 2.13、util
+ BeanMapper：Bean与Map转换工具类
+ DTOValidator：基于hibernate-validation注解校验工具类
+ EnumConvert：枚举工具类
```java
/**
 * @description: 枚举转换类
 * @Date : 2018/6/11 下午6:16
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class EnumConvert {

    private static final String SYMBOL = ",";
    private static final String DEFAULT_VALUE = "";

    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param value 以,分割的索引字符串
     * @return
     */
    public static final String convertIndex2String(EnumValue[] enumValues,String value){
        return convertIndex2String(enumValues,value,DEFAULT_VALUE);
    }
    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param value 以,分割的索引字符串
     * @return
     */
    public static final String convertIndex2String(EnumValue[] enumValues,String value,String defaultValue){
        if(null == value || "".equals(value)){
            return defaultValue;
        }
        return convertIndex2String(enumValues,Arrays.asList(value.split(SYMBOL)));
    }
    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param values 要迭代的集合,Collection<E> 接口只能传String、Character、Integer、Short类型</>
     * @return
     */
    public static final String convertIndex2String(EnumValue[] enumValues,Collection<Object> values){
        Map<Integer,String> map = Arrays.asList(enumValues).stream().collect(Collectors.toMap(EnumValue::getIndex,EnumValue::getName));
        return appendEnumValue(map,values);
    }

    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param values 要迭代的集合,Collection<E> 接口只能传String、Character、Integer、Short类型</>
     * @return
     */
    public static final String convertIndex2String(EnumDesc[] enumValues, Collection<Object> values, Function<EnumDesc,String> valueMapper){
        Map<Integer,String> map = Arrays.asList(enumValues).stream().collect(Collectors.toMap(EnumDesc::getIndex,valueMapper));
        return appendEnumValue(map,values);
    }

    /**
     * 循环Collection<Object>集合，并从map容器中获取对应的元素返回字符串
     * @param map map容器
     * @param values Collection<Object>集合
     * @return
     */
    protected static String appendEnumValue(Map<Integer,String> map,Collection<Object> values){
        StringBuffer sb = new StringBuffer();
        for(Object each : values){
            String enumValue = null;
            if(each instanceof Integer || each instanceof Short || each instanceof String || each instanceof Character){
                enumValue = map.get(Integer.valueOf(each.toString()));
            }
            if(enumValue != null){
                sb.append(enumValue).append(SYMBOL);
            }
        }
        String result = sb.toString();
        return result.length() > 0 && result.endsWith(SYMBOL) ? result.substring(0,result.length() - 1) : result;
    }

    private EnumConvert(){}

    public static void main(String[] args) {
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),"","不限"));
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),Arrays.asList("0","1")));
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),Arrays.asList(0,1)));
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),Arrays.asList('0','1')));
        System.out.println(convertIndex2String(ConstEnum.DriverLicenseOwnerNewEnum.values(),Arrays.asList("01"),EnumDesc::getDesc));
    }
}
```
### 3、DTO定义说明
1、DTO需要继承BaseDTO对象
2、基于lombok注解引入@Data、@NoArgsConstructor、@AllArgsConstructor、@Builder注解
3、基于oval引入相关字段校验注解
示例如下：
```java
/**
 * @description: GPS设备商认证DTO对象
 * @Date : 下午7:48 2018/1/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GpsDeviceAgencyDTO extends BaseDTO {
    private static final long serialVersionUID = -6165001330649484325L;
    /**
     * GPS设备商类型
     */
    @NotEmpty(message = "GPS设备商类型不能为空")
    @EnumValidation(enums = GpsDeviceAgencyType.class,method = EnumValidation.InvokeMethod.getName,message = "非法GPS设备商类型")
    private String agencyType;
    /**
     * GPS设备号集合
     */
    @NotNull(message = "deviceList不能为空")
    @Size(message = "deviceList大小必须[0-2]",max = 2)
    private List<String> deviceList;
}
```
### 4、枚举定义说明
#### 4.1、包含index/name字段
枚举需要实现EnumValue接口，统一提供两个静态方法getNameByIndex和getByIndex

```java
/**
 * @description: GPS影像件code 枚举
 * @Date : 2018/8/13 上午11:37
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum GpsImgCodeEnum implements EnumValue {
    wired_gps_num(1, "有线GPS编号"),
    wired_gps_far(2, "有线安装远景"),
    wired_gps_clo(3, "有线安装近景1"),

    wireless_gps_num(4, "无线GPS编号"),
    wireless_gps_far(5, "无线安装远景"),
    wireless_gps_clo(6, "无线GPS近景"),

    gps_installation(7, "GPS安装单"),
    gps_car_nameplate(8, "车辆铭牌"),
    p_car(9, "整车照片"),
    gps_other(10, "补充材料"),

    ;

    GpsImgCodeEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    private int index;
    private String name;

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 根据索引获取名称
     * @param index 索引
     * @return
     */
    public static String getNameByIndex(int index){
        for(GpsImgCodeEnum e : GpsImgCodeEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param index 索引
     * @return
     */
    public static GpsImgCodeEnum getByIndex(int index){
        for(GpsImgCodeEnum e : GpsImgCodeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举名称集合
     * @return
     */
    public static List<String> codeList(){
        return Arrays.asList(GpsImgCodeEnum.values()).stream().map(each -> each.name()).collect(Collectors.toList());
    }
}
```
#### 4.2、包含index/name/desc字段
枚举需要实现EnumDesc接口，统一提供静态方法getNameByIndex、getByIndex、getByDesc
示例如下
```java
/**
 * @description: GPS人工审核结果代码枚举
 * @Date : 2018/6/20 上午10:45
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum GpsManualAuditCodeEnum implements EnumDesc{
	SUCCESS(1,"1", "审核通过"),
	FAIL_IMG_BZ(2,"2", "审核失败（安装照片数量不足）"),
	FAIL_CAR_BF(3,"3", "审核失败（安装照片车型、颜色与系统不符）"),
	FAIL_CPYZ(4,"4", "审核失败（重拍远照）"),
	FAIL_CPJZ(5, "5","审核失败（重拍近照）"),
	FAIL_GHAZWZ(6,"6", "审核失败（需更换安装位置）"),
	FAIL_7(7,"7", "无线不隐蔽，更换安装位置"),
	FAIL_8(8,"8", "请补充无线安装照片"),
	FAIL_9(9,"9", "GPS安装位置不符合要求（GPS设备必须一前一后，有线严禁接发动机舱），重新安装"),
	FAIL_10(10,"10", "车铭牌与车不符或车架号与系统不符"),
	FAIL_11(11,"11", "车型与系统不符或车身颜色与系统不符"),
	FAIL_12(12, "12","GPS资料中设备号与系统设备号不符，重新修改核对"),
	FAIL_13(13,"13", "GPS申请表有误，重新检查修改"),
	FAIL_14(14,"14", "有线无轨迹，重新验证"),
	FAIL_15(15,"15", "无线超时无信号，重新验证"),
	FAIL_16(16,"16", "GPS安装照片与其他客户安装照片完全相同"),
	FAIL_17(17, "17","GPS设备号重复使用"),
	FAIL_18(18,"18", "客户在GPS安装现场	"),
	FAIL_19(19, "19","无线超时无信号"),
	FAIL_20(20, "20","有线无轨迹"),
	OTHER(100, "100","其他"),
	;

	GpsManualAuditCodeEnum(Integer index, String name, String desc) {
		this.index = index;
		this.name = name;
		this.desc = desc;
	}

	private int index;
	private String name;
	private String desc;

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * 根据索引获取名称
	 * @param index 索引
	 * @return
	 */
	public static String getNameByIndex(int index){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getIndex() == index){
				return e.getName();
			}
		}
		return null;
	}

	/**
	 * 根据索引获取枚举对象
	 * @param index 索引
	 * @return
	 */
	public static GpsManualAuditCodeEnum getByIndex(int index){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}

	/**
	 * 根据索引获取枚举对象
	 * @param desc 索引
	 * @return
	 */
	public static GpsManualAuditCodeEnum getByDesc(String desc){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getDesc().equals(desc)){
				return e;
			}
		}
		return null;
	}

	/**
	 * 根据代码查询名称，特别注意（由于后期需求数据库中存储的可以是多个，因此请注意）
	 * @param code 代码
	 * @return
	 */
	public static String getNameByCode(String code){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getName().equals(code)){
				return e.getName();
			}
		}
		return "";
	}

	/**
	 * 根据代码查询名称
	 * @param codes 代码，以";"分割
	 * @return
	 */
	public static String getNamesInScope(String codes){
		if(null == codes || "".equals(codes)){
			return "";
		}
		StringBuffer sb = new StringBuffer();
		String[] arrays = codes.split(";");
		for(String code : arrays){
			sb.append(getNameByCode(code)).append(";");
		}
		if(sb.length()>0){
			return sb.substring(0,sb.length()-1);
		}
		return "";
	}

}
```