import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext.xml");

        Bank bank = context.getBean("bank", Bank.class);
        System.out.println(bank.getCahsh());
        System.out.println(bank.getDirector().getName());
        System.out.println(bank.getDirector().getAddress().getHouse());
        System.out.println(bank.getDirector().getAddress().getStreet());
    }
}
