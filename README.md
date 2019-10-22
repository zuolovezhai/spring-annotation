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

#### 注解的属性

#### 基本注解

-------------------------未完待续--------------------------------------- 
                                              