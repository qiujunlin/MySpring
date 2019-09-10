###  简单的 IOC

> 最简单的 IOC 容器只需4步即可实现，如下：

- 加载 xml 配置文件，遍历其中的标签
- 获取标签中的 id 和 class 属性，加载 class 属性对应的类，并创建 bean
- 遍历标签中的标签，获取属性值，并将属性值填充到 bean 中
- 将 bean 注册到 bean 容器中  容器是一个HashMap对象  通过get("name")的方式取得