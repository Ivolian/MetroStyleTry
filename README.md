介绍
===================================
> 1. 随便写些 Metro 风格的东西，希望能不断完善。
> 2. ZoomAnim 类，用于给 View 添加缩放动画。
>     可以长按使得 View 不反弹，多次点击也不会影响到进行中的动画。  

改动日志 2014/8/20
===================================
> 1. 添加 swipe 属性。按住 View，当 View 的 BeginAnim 结束后，手指滑动一段距离，会触发 EndAnim。
> 2. 添加 AfterEndAnimFinish 接口，以非 swipe 方式触发的 EndAnim 结束后会调用该接口中的 doSomething 方法。 
> 3. 更新实例。

样例
===================================
![github](https://github.com/Ivolian/MetroStyleTry/blob/master/example.jpg "github")

