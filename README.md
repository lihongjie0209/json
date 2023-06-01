基于antlr4的json解析器


## 用法



```java

cn.lihongjie.json.Json#toMap
        
cn.lihongjie.json.Json#toList
```


## 实现
`cn.lihongjie.json.Json` 使用Listener模式解析json, 使用Stack模拟返回值.

`cn.lihongjie.json.JsonByVisitor` 使用Visitor模式解析json.