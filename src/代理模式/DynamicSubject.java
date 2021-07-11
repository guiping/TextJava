package 代理模式;

/***
 * 动态代理类实现
 */
public class DynamicSubject  implements Dynamic{

    @Override
    public void visit() {
        System.out.println("动态代理了输出 DynamicSubject");
    }
}
