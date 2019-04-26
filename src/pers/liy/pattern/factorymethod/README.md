# Factory Method 模式

### 定义
- 用Template Method模式构建生成实例的工厂
- 父类决定实例的生成方式，但不决定所要生成的具体类，具体的处理全部交给子类负责，起到解耦的作用

### 实现
- framework包：Product类、Factory类
- idcard包：IDCard类、IDCardFactory类

### 说明
- 只要Factory Method模式，在生成实例时就一定会使用到Template Method模式	
- 不用new生成实例，而用专用的方法来生成实例，可防止父类与其他类耦合