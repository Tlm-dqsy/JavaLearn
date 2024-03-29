package 运算符基础;

public class 计算机基础知识 {
//计算机：由软件和硬件组成，没安装软件的称之为裸机；
//冯.诺依曼结构（计算机硬件5大组件：（运算器、控制器合称CPU）、存储器(内存 外存)、输入设备和输出设备）
//软件分为：系统软件：windows，dos，Linux，Unix，Mac（在苹果中的），IOS，Android 和 应用软件；
}
class 软件开发和计算机语言概述{
//软件就是数据和指令的集合；
// 计算机语言分类：机器语言【0/1】、汇编语言、高级语言【通过编译器来给计算机0、1指令】；
}
class 人机交互{
//人机交互有命令行方式和图形界面方式；
}
class 键盘功能和快捷键{
//Tab 制表符【保证良好的格式】
//shift 上档转换键
//ctrl 控制键 一般和别的配合使用+A全选、+C复制、+V粘贴、+X剪切、+Z撤销、+S保存
//Alt 意思是转变 一般也和别的键子配合使用
//Enter 一般是用来提交 或者换行
//window 和别的配合使用 +D快速显示桌面、+R执行运行命令、+L切换用户、+E启动我的电脑
//PrtSc（PrintSceeen）截屏工具
}
class 打开DOS控制台的方式{
//Window + R 之后敲cmd，即可打开dos控制台；
}
class 常见Dos命令讲解_了解即可{
//在cmd打开控制台之后想进到哪个盘，就敲哪个盘加冒号即可；、
//dir 打开当前目录下的所有文件以及文件夹
//md 创建目录（即创建文件夹）  ed 删除文件夹
//cd 进入哪个目录之后就加那个目录名字
//cd.. 返回上级目录      cd\ 返回到根目录
//del 删除文件 eg：del a.txt 这样就会删除当前目录的a.txt文件
//del *.txt就是删除所有.txt文件
//cls 清屏        esit 退出dos窗口
}
class Java语言概述_跨平台原理_JRE和JDK的概述{
//J2SEjava基础    J2ME小型版    J2EE企业版【Servlet、jsp】
//通过java语言编写的应用程序可以在不同的系统上运行【只要先安装一个Java虚拟机，即JVM即可】；
//因为java有不同版本的虚拟机，所以并不是java语言可跨平台，只是java的虚拟机有不同系统的；
//JRE是java的运行环境，要是不敲代码，只看结果的话，就只要JRE就可以了；
//JDK是给开发人员使用的，只要安装了JDK就不用安装JRE了，但是写完程序是要看一眼结果的，所以也要安装JRE；
//JDK包含了JRE+JAVA，装JDK就不用装JRE;
}
class JDK的下载和安装的过程_JDK安装路径下的目录解释_开发工具介绍{
//http://www.oracle.com && http://java.sun.com 用后者的都是后会自动跳转到前面网址；
//建议安装32位的，因为如果是64位的就总会出现意想不到的bug；
//bin目录下：javac.exe是java编译器、java.exe是java运行工具、jar.exe是打包工具、javadoc.exe是文档生成工具；
//db目录：是一个小型的数据库；
//jre目录：是JAVA运行环境，包含一个虚拟机，可以使程序运行起来；
//include目录：因为jdk是由c++和c实现的，该目录是存放这些头文件的；
//lib是开发工具使用的归档包文件；
//src.zip文件：是src的压缩文件，防指的是JDK核心类的源代码，可查看java基础类的源码；
//notepad记事本、editplus、eclipse、myeclipse
}
class HELLOWORLD案例的编写和运行_HelloWorld案例常见问题语言的书写格式之约定俗成{
//class 是声明一个类 后面要跟类名 之后是一个大括号 表示一个范围 代码要写在其中；
//要求类名和文件名一样 在cmd里编译时文件名后要有.java，运行时不用加.java
//public static void main(String[] args){}是程序的入口；
//文件扩展名被隐藏了，或者名字拼错了，以及大小写问题，中英文格式，括号多一个少一个等等，都会导致出不来结果；
	//大括号要对齐，且成对出现、左大括号前有空格、遇到左大括号要缩进、方法和程序间留一个空行、并排语句之间加空格、运算符两侧加空格；
}
class path环境变量的作用及配置方式_{
//把javac配置到path里 就可以在各个盘去运行了，道理同电脑自带记事本；
//需要把bin目录配置到path里，因为bin里面装的是javac之类的文件；
//配置好path之后就可以把写好的代码随意存了 不用都放在指定一起目录；
//流程：属性-高级系统设置-环境变量-找到path-点击新建-起名叫Java_Home-变量值配成盘下JDK的安装路径-之后再path里最前面写上%Java_Home%，这样即使以后需要修改java版本时会更好找；
}
//2019年6月17日，今日份学习完成，明天狗子阳历生日，要出去happy，都要加油呢！！！


