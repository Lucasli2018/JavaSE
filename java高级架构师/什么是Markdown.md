# 什么是Markdown

Markdown是一种方便记忆书写的**纯文本标记语言**

他是世界上最大的技术分享网站github的御用书写格式

## 1. 制作一份简单的代办事项TODO列表

这个功能好像typora做不到，但是在mark飞象是可以的

这个是一级标题

====

1个* 包围是*斜体*，快捷键ctrl+i，*斜体*

2个* 包围是**粗体**，快捷键ctrl+b，**粗体**

3个* 包围是***斜体加粗***，快捷键ctrl+i+b，***斜体加粗***

1个_ 包围是_下划线_，快捷键ctrl+u，<u>下划线</u>

2个_ 包围是 __加粗__，快捷键ctrl+b，**加粗**

2个~ 包围是~~中间划线~~

2个= 包围是==高亮==，这个对于typora来说无效

3个---单独一行就是换行

---

+或者-或者*+空格就是无序列表

- 无序列表1

1+.+空格就是有序列表

1. 小写字母
2. 数字
3. 下划线

> 表示引用>

[百度](www.baidu.com)表示链接，快捷键是ctrl+k，[百度](www.baidu.com)

### 表格

快捷键ctrl+t

| 姓名 | 性别 |
| :--- | :--: |
| 张三 |  男  |

| 项目   | 价格 | 数量 |
| :----- | ---: | :--: |
| 计算机 | 1600 |  5   |
| 手机   | 1000 |  4   |

#### ~~待办事项~~

做不到

#### 标注

markdown[^1]

这里是一个很长很长。。。

。。。

。。

的介绍

[^1]:Markdown是一种纯文本标记语言

#### 代码

这是一段短代码`System.out.println('Helllo~')`

```java
class Hello{
    public static void main(String[] args){
        System.out.println("Helllo,java!");
    }
}
```

快捷键ctrl+shift+k

#### 数学公式

行内公式 $$ e=mc^2 $$

这个也做不到

#### 流程图

```flow
st=>start: 开始
op=>operation: 登陆
cond=>condition: 用户名密码是否正确
e=>end: 结束

st->op->cond
cond(yes)->e
cond(no)->op

```

#### 序列图

```sequence
alice->bob: hello bob,how are you?
note right of bob: bob think
bob->alice: I am good thanks
```

####  甘特图

```mermaid
gantt

title 项目开发流程
section 项目确定
	需求分析:a1,1d
	可行性报告:after a1,1d
	概念验证:1d
section 项目实施
	概要设计:1d
	项目设计:1d
	编码:2d
	测试:1d
section 发布验收
	发布:1d
	验收:1d
```



















