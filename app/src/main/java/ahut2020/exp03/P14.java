package ahut2020.exp03;
//14.	山乡希望小学收到一箱捐赠图书，邮件上署名是“兴华中学高二班”，山乡希望小学校
// 长送来了感谢信，可是兴华中学高二年级有四个班，校长找来了四个班的班长，问他们是哪
// 个班做的这件好事。一班的班长说：“是四班做的。”二班的班长说：“是三班做的好事。”三
// 班的班长说：“不是我们班。”   四班的班长说：“三班的班长说的不对。”
// 四个班的班长都说不是自己班做的，这就难坏了校长，后来得知四个班的班长中有两个
// 说得是真话，有两个没有说真话，请你利用计算机的逻辑判断编一个程序，找出究竟是哪个
// 班做了这件好事。不能手算后直接打印结果。
public class P14 {
    public static void main(String[] args) {
        for(int a1=0;a1<=1;a1++)
            for(int a2=0;a2<=1;a2++)
                for(int a3=0;a3<=1;a3++)
                    for(int a4=0;a4<=1;a4++){
                        int p1=(a4==1)?1:0;
                        int p2=(a3==1)?1:0;
                        int p3=(a3==0)?1:0;
                        int p4=1-p3;
                        if(p1+p2+p3+p4!=2)continue;
                        if(a1+a2+a3+a4!=1)continue;
                        System.out.println(String.format("%d%d%d%d",a1,a2,a3,a4));
                    }
    }
}
