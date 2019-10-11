public class Test {
    public static void main(String[] args) {

        VipCustomer Jazmin = new VipCustomer("Jazmin", 1000);
        VipCustomer Joi = new VipCustomer("Joi", 2000, "joi@email.com");
        VipCustomer Ryan = new VipCustomer();

        System.out.println(Jazmin.getName());
        System.out.println(Jazmin.getCreditLimit());
        System.out.println(Jazmin.getEmail());
        System.out.println();
        System.out.println(Joi.getName());
        System.out.println(Joi.getCreditLimit());
        System.out.println(Joi.getEmail());
        System.out.println();
        System.out.println(Ryan.getName());
        System.out.println(Ryan.getCreditLimit());
        System.out.println(Ryan.getEmail());

    }
}
