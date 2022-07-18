### JVM笔记
#### 虚拟机内存区域
> 待补充
##### 堆
1. 对象内容存放位置
##### 方法区
1. 用于存储类型的相关信息，如类名、访问修饰符、常量池、字段描述、方法描述等
2. Jdk7以上字符串常量池存在从方法区移到堆中
3. Jdk8以上使用-XX:MaxMeta-spaceSize修改方法区容量限制
##### 虚拟机栈
1. 线程请求的栈深度大于虚拟机允许的最大深度，抛出StackOverFlowError
2. 虚拟机栈内存允许动态扩展，当扩展栈容量无法申请足够的内存时抛出OutOfMemoryError
##### 本地方法栈
1. 服务于本地方法
##### 程序计数器
1. 程序运行控制
#### OutOfMemory练习
1. -Xms：设置最小堆内存
2. -Xmx：设置最大堆内存
3. -XX:+HeapDumpOnOutOfMemoryError：内存溢出是保存相关信息到本地文件
4. -Xss：设置栈容量
5. -XX:MaxMetaspaceSize：jdk8以上使用该设置来修改方法去内存大小，设置元空间最大值，默认-1，即不限制
6. -XX:MetaspaceSize: 设置元空间初始值
7. -XX:PermSize=10M 设置方法区最小内存
8. -XX:MaxPermSize=10M 设置方法区最大内存
9. -XX:MinMetaspaceFreeRatio:最小元空间剩余容量的百分比
10. -XX:MaxMetaspaceFreeRatio:最大元空间剩余容量百分比  
11. -XX:MaxDirectMemorySize:指定最大直接内存大小，不指定则和堆内存一致，通过-Xmx指定
#### 垃圾收集器与内存分配策略
1. -XX:+PrintGC:打印GC日志
2. -XX:+PrintHeadAtGC:GC时打印堆日志
3. java不通过引用计数法来判断对象是否可回收
4. java通过可达性分析算法回收对象，使用一系列GC ROOT作为起始节点，对象到root不可达，则可回收
5. finalize方法只会执行一次，执行finalize可以自救避免被回收

