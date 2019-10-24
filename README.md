# SpringAnnotation
主要介绍spring annotation的基本概念、理解以及具体使用方法

## Annotation
我们学习任何一个知识，首先应该了解的应该是它是什么，Annotation也是一样。下
面是wiki对Annotation的解释:
```
An annotation is extra information associated with a particular point in 
a document or other piece of information. It can be a note that includes 
a comment or explanation.Annotations are sometimes presented in the margin 
of book pages.
```
翻译(from google translate)过来就是:
```
注释是与文档中特定点或其他信息相关的额外信息。它可以是包含注释或解释的注释。
注释有时会在书页的空白处显示.
```
我个人对于Annotataion的理解就是标签，比如说一个人，我们可以给他一个称号：码农。
那么码农就是这个人的其中一个标签，解释这个人的一些其他信息。
形同此理，代码中的Annotation也就是类、方法、属性等的一个标签。

## JAVA Annotation
java Annotation其实和class和interface一样也是一种类型。它是从Java SE5.0开始
引入的概念。除了JDK内置的注解外，用户还可以自定义注解

### JDK 内置注解
JDK内置了基本注解和元注解
#### 元注解
JDK内置了4个元注解。所谓元注解就是注解的注解。它可以使用在注解上，是注解的标签
##### @Retention
Retention翻译过来是保留的意思,此注解说明了注解的存活时间

取值如下:
- RetentionPolicy.SOURCE: 注解在编译期间被丢掉
- RetentionPolicy.CLASS: 注解将被编译器记录到class文件中，但在运行时被JVM
丢弃，是默认的注解保留时间
- RetentionPolicy.RUNTIME: 注解被保留到JVM运行时，因此可以通过反射获取它们 

##### @Documented
Documented翻译过来是已记录的,作用是将注解中的元素包含到Javadoc中

##### @Target
Target是目标的意思,指明了注解运用在什么地方

取值如下:
- ElementType.TYPE: 使用在类、接口(包括注解)、枚举上
- ElementType.FIELD: 使用在属性上，包括枚举常量
- ElementType.METHOD: 使用在方法上
- ElementType.PARAMETER: 使用在形参上
- ElementType.CONSTRUCTOR: 使用在构造方法上
- ElementType.LOCAL_VARIABLE: 使用在局部变量上
- ElementType.ANNOTATION_TYPE: 使用在注解上
- ElementType.PACKAGE: 使用在包上
- ElementType.TYPE_PARAMETER: 使用在类型的声明式前, JDK1.8新增
- ElementType.TYPE_USE: 可以使用在所有使用类型的地方, JDK1.8新增

##### @Inherited
Inherited是继承的意思,指的是如果一个父类被@Inherited注解过的注解进行了注解,
如果字类没有被注解过,那么子类将继承父类的注解

##### @Repeatable
Repeatable是可重复的意思,指明注解可以被多次使用.一个人可以是儿子,也可以是父
亲,还可以是丈夫.

#### 注解的定义
注解通过 **@interface** 来定义
```
public @interface AnnotationDefine {
   
}
```

#### 注解的属性
注解的属性也叫成员变量.注解只有成员变量,没有方法.注解的成员变量以"无形参的方法"
来声明:

```
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationAttribute {
    int id() default ;
    String msg();
}
```
注解AnnotationAttribute中有id和msg两个属性，接下来看看如何使用此注解:
```
@AnnotationAttribute(id=1, msg="zuoshengli")
public class AnnotationTest {
}
```
***NOTE***:注解中属性的类型必须是8种基本数据类型、类、接口、注解以及他们
的数组

注解可以有默认值:
```
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationAttribute {
    int id() default 1;
    String msg() default "zhaiyali";
}
```
有默认值的属性在指定的时候可以不写值:
```
@AnnotationAttribute
public class AnnotationTest {
}
```

#### 预置注解

##### @Override
当子类重写(复写)父类中的方法时使用此注解

##### @SuppressWarnings
用来忽略一些警告信息

##### @SafeVarargs(since jdk1.7)
提醒开发者不要用参数做一些不安全的操作,它的存在会阻止编译器产生 unchecked 
这样的警告

## Spring注解
通过上面的文章,相信大家对注解已经有了一个最基本的了解.下面我们进入正题,来学习
Spring Annotation

### @Controller
当一个组件作为前端交互的控制层,使用@Controller进行标记,例如:
```
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
```
访问此controller的请求将会跳转到index.html页面


-------------------------未完待续--------------------------------------- 
                                              