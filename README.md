**鉴于在实际开发中，经常碰到这类问题，服务端返回的数据结构如何适配android的UI？本demo抽取了帮朋友公司做的一个类似PC端异构目录的功能，尴尬的是，只解决了android端的问题，反倒是让朋友公司IOS工程师处于比较尴尬的境地。本demo解决了比较复杂的动态的数据层级在手机UI中的展示，比较考验数据结构知识以及递归算法的灵活运用**

*效果图展示*
<img src="https://github.com/wangyubao/Demo_tree_view/blob/master/image/61514535455_.pic.jpg width = "300" alt="效果图" align=left />

*数据结构示意图*<br>
<img src="https://github.com/wangyubao/Demo_tree_view/blob/master/image/ED007043-15C2-4BC9-A2A5-AE14D14CC734.png width = "300" alt="效果图" align=left />
需要解决两个问题<br>
1、数据解析。数据的层级是动态的，每次返回的department下面具体还有几层架构是不固定的，且数据比较繁杂<br>
2、数据适配listView

*解决数据解析问题*<br>
<img src="https://github.com/wangyubao/Demo_tree_view/blob/master/image/7A935034-80B0-4C68-B171-83A2575D964E.png width = "300" alt="效果图" align=left />

*递归算法解决适配问题*<br>
<img src="https://github.com/wangyubao/Demo_tree_view/blob/master/image/336AD9C0-CEE8-46A5-9A83-E6B2688C4DB5.png width = "300" alt="效果图" align=left />

