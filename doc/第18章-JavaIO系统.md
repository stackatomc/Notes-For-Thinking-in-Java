# 第18章 Java I/O系统（未完）

标签：Java

---

## File类

- File类能代表一个特定文件的名称，又能代表一个目录下的一组文件的名称
- 经常使用到目录列表其遍历排序，正则表达式重写筛选文件类型/getAbsolutePath().endsWith()
- 一种是重写类，一种是匿名内部类。使用到策略模式。
- 区分list()和listFiles()的返回类型区别.前是String[],后是File[]

---

## 字节流（主要涉及格式化）

- InputStream/OutputStream
- FileInputStream/FileOutputStream
- BufferedInputStream/BufferedOutputStream
- InputStream接受数据源输入包括1)字节数组 2)String对象 3)文件 4)"管道"，一端进一端出 5)其他数据源如Internet连接等
- DataInputStream/DataOutputStream
```
DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(filepath)));
dis.available(){...判断是否结束输出(char)in.readByte()...}
```

---

## 字符流（主要是与文件交互）

- BufferedReader/BufferedWriter
- FileReader/FileWriter
```
BufferedReader br=new BufferedReader(new FileReader(filepath)));
StringBuilder sb=new StringBuilder();
s=br.readLines();
```
- 字符流支持Unicode16位，字节流8位

---

## RandomAccessFile

- 特点是适应于大小已知的记录组成的文件，所以我们可以使用seek()将记录从一处转移到另一处
- 在JDK1.4中，RandomAccessFile的大多数功能(但不是全部)由nio存储映射文件所取代

---

## PrintWriter

- 侧重于输出，而使用到写入流等应使用OutputStream等

---

## 重要例子

```
/**
 * @author MayerFang
 * @file BufferedInputFile
 * @Description 实现将文件内容以字符流方式读取出来
 * @date 2018/8/21
 */
public static String read(String filepath)throws IOException{
        BufferedReader in=new BufferedReader(
                new FileReader(filepath)
        );
        String s;
        StringBuilder str=new StringBuilder();
        while((s=in.readLine())!=null){
            str.append(s+"\n");
        }
        in.close();
        return str.toString();
    }
```

```
/**
 * @author MayerFang
 * @file FormattedMemoryInput
 * @Description 使用DataInputStream 面向字节读取输出 文件内容
 * @date 2018/8/21
 */
public static void main(String[] args)throws IOException {
        try{
            DataInputStream in=new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("H:\\Test\\a2.txt").getBytes()
                    )
            );
            while(in.available()!=0)
                System.out.print((char)in.readByte());
        }catch(EOFException e){
            e.printStackTrace();
        }
    }
```

```
/**
 * @author MayerFang
 * @file MemoryInput
 * @Description StringReader 读取文件按字节流输出 int char 结合BufferedInputFile类
 * @date 2018/8/21
 */
    public static void main(String[] args)throws IOException {
        StringReader in=new StringReader(
                BufferedInputFile.read("H:\\Test\\a2.txt")
        );
        int c;
        while((c=in.read())!=-1){
            System.out.print((char)c);
        }
    }
```