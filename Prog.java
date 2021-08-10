import java.io.*;
public class Prog
{
    int bill;
    int i=0;
    int AAA;
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        Prog func=new Prog();
        func.start();
        func.content();
    }

    public void start()throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        for(int i=0;i<3;i++)
        {
            for(int k=0;k<999999999;k++)
            {
            }            
            System.out.println();
            System.out.println();
            System.out.println("            *       *   * * * * *  *           * * * * *   * * * * *    *       *   * * * *  ");
            System.out.println("            *       *   *          *           *           *       *    * *   * *   *        ");
            System.out.println("            *       *   *          *           *           *       *    *  * *  *   *        ");
            System.out.println("            *   *   *   * * *      *           *           *       *    *   *   *   * * *    ");
            System.out.println("            *  * *  *   *          *           *           *       *    *       *   *     ");
            System.out.println("            * *   * *   *          *           *           *       *    *       *   *        ");
            System.out.println("            *       *   * * * * *  * * * * *   * * * * *   * * * * *    *       *   * * * *  ");
            System.out.println();  
            System.out.println();
            System.out.println("                                 * * * * * * *    * * * * * ");
            System.out.println("                                       *          *       * ");
            System.out.println("                                       *          *       * ");
            System.out.println("                                       *          *       * ");
            System.out.println("                                       *          *       * ");
            System.out.println("                                       *          *       * ");
            System.out.println("                                       *          * * * * * ");
            System.out.println();
            System.out.println();
            System.out.println("  !!!!!!!  !!!!!!!!!!  !!!!!!!!!!  !!!!!!!!!!       !           !       !  !       !  !!!!!!!!!! ");
            System.out.println("  !!   !!      !!             !           !        ! !          !       !  !       !      !!      ");
            System.out.println("  !!!!!!!      !!           !           !         ! ! !         !       !  !       !      !!     ");
            System.out.println("  !!           !!          !          !          ! ! ! !        !!!!!!!!!  !       !      !!     ");
            System.out.println("  !!           !!        !          !           !       !       !       !   !     !       !!       ");
            System.out.println("  !!       !!!!!!!!!!   !!!!!!!!!  !!!!!!!!!!  !         !      !       !    ! ! !        !!       ");
            for(int k=0;k<999999999;k++)
            {
            }
            System.out.println("\f");
        }
        System.out.println("\t\t\t\tEnter an integer to enter in Pizza Hut!!!");
    }

    public void content ()throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("\f");
        System.out.println("Press 1 for Menu");
        System.out.println("Press 2 for Nutrition");
        System.out.println("Press 3 for Work with Us");
        System.out.println("Press 4 for Franchising");
        System.out.println("Press 5 for About Us");
        System.out.println("Press 6 for Contact Us");
        System.out.println("Press 7 for FAQ's(Frequently Asked Questions)");
        System.out.println("Press 8 for Terms and Conditions");
        System.out.println("Press 9 for Latest");
        int ch=Integer.parseInt(in.readLine());
        if(ch>0 && ch<10)
            System.out.println("\f");
        switch(ch)
        {
            case 1:
            System.out.println("Enter 1 for Favourites");
            System.out.println("Enter 2 for Classics");
            System.out.println("Enter 3 for Meals");
            System.out.println("Enter 4 for Sides");
            int ch1=Integer.parseInt(in.readLine());
            if(ch1>0 && ch<5)
                System.out.println("\f");
            switch(ch1)
            {
                case 1:
                /*Favourites of Menu*/
                System.out.println("Enter 1 for Veg Menu");
                System.out.println("Enter 2 for Non Veg Menu");
                int ch2=Integer.parseInt(in.readLine());
                if(ch2==1 || ch2==2)
                    System.out.println("\f");
                switch(ch2)
                {
                    case 1:
                    /* Veg Menu of Favourites of Menu*/
                    System.out.println("1. Hawaiian");
                    System.out.println("2. El Scorcho Pepperoni");
                    System.out.println("3. New Yorker");
                    System.out.println("4. Veggie Delight");
                    System.out.println("Enter the number to know further details of it");
                    int ch3=Integer.parseInt(in.readLine());
                    if(ch3>0 && ch<5)
                        System.out.println("\f");
                    switch(ch3)
                    {
                        case 1:
                        /* Hawaiian of Veg Menu for Favourites of Menu*/
                        System.out.println("Contains ham and pineapple.\nToppings available are Ham, pineapple, mozzarella, tomato sauce");
                        System.out.println("Costs Rs. 100");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String A=in.readLine();
                        AAA=100;
                        back(A,AAA);
                        break;
                        case 2:
                        /* El Scorcho Pepperoni of Veg Menu for Favourites of Menu*/
                        System.out.println("Contains Pepperoni, hot jalapenos, onion & diced tomato.\nToppings available are Pepperoni, hot jalapenos, onion, diced tomato, mozzarella, tomato sauce");
                        System.out.println("Costs Rs. 110");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String B=in.readLine();
                        AAA=110;
                        back(B,AAA);
                        break;
                        case 3:
                        /* New Yorker of Veg Menu for Favourites of Menu*/
                        System.out.println("Contains Pepperoni, mushroom, Italian sausage, onion & oregano.\nToppings available are Pepperoni, mushroom, Italian sausage, onion & oregano");
                        System.out.println("Costs Rs. 120");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String C=in.readLine();
                        AAA=120;
                        back(C,AAA);
                        break;
                        case 4:
                        /* Veggie Delight of Veg Menu for Favourites of Menu*/
                        System.out.println("Contains Diced tomato, pineapple, capsicum, onion, mushroom with garlic & oregano.\nToppings available are Diced tomato, pineapple, capsicum, onion, mushroom with garlic & oregano");
                        System.out.println("Costs Rs. 130");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String D=in.readLine();
                        AAA=130;
                        back(D,AAA);
                        break;    
                        default:
                        System.out.println("Wrong Choice");
                        System.out.println();
                        info();
                    }
                    break;
                    case 2:
                    /* Non Veg Menu for Favourites of Menu*/
                    {
                        System.out.println("1. Chicken Jewel");
                        System.out.println("2. Chicken Majestic");
                        System.out.println("3. Chicken Splendour");
                        System.out.println("Enter the number to know further details of it");
                        int ch8=Integer.parseInt(in.readLine());
                        if(ch8>0 && ch<4)
                            System.out.println("\f");
                        switch(ch8)
                        {
                            case 1:
                            /* Chicken Jewel of Non Veg Menu for Favourites of Menu*/
                            System.out.println("Contains Chicken Kebabs with Tomato, Onion, Green Chilli, Oregano Sprinkle and Cheese");
                            System.out.println("Costs Rs. 430");
                            System.out.println("Do you want to buy??? Type yes else no");
                            String AA=in.readLine();
                            AAA=430;
                            back(AA,AAA);
                            break;
                            case 2:
                            /* Chicken Majestic of Non Veg Menu for Favourites of Menu*/
                            System.out.println("Contains Chicken Kebabs with Hot and Spicy Chicken, Tomato, Green Capsicum, Onion, Olive, Oregano Sprinkle and \nCheese");;
                            System.out.println("Costs Rs. 495");
                            System.out.println("Do you want to buy??? Type yes else no");
                            String AB=in.readLine();
                            AAA=495;
                            back(AB,AAA);
                            break;
                            case 3:
                            /* Chicken Splendour of Non Veg Menu for Favourites of Menu*/
                            System.out.println("Contains Chicken Kebabs with Chicken Tikka, Onion, Green Capsicum, Sweet Corn, Red Paprika, Olive and Cheese.");
                            System.out.println("Costs Rs. 540");
                            System.out.println("Do you want to buy??? Type yes else no");
                            String AC=in.readLine();
                            AAA=540;
                            back(AC,AAA);
                            break;
                            default:
                            System.out.println("Wrong Choice");
                            System.out.println();
                            info();
                        }
                    }
                    break;
                    default:
                    System.out.println("Wrong Choice");
                    System.out.println();
                    info();
                }
                break;
                case 2:
                /* Classics of Menu*/
                System.out.println("Enter 1 for Veg");
                System.out.println("Enter 2 for Non Veg");
                int ch4=Integer.parseInt(in.readLine());
                if(ch4==1 || ch4==2)
                    System.out.println("\f");
                switch(ch4)
                {
                    case 1:
                    /* Veg of Classics of Menu */
                    System.out.println("Enter 1 for Veg Baked Pasta");
                    System.out.println("Enter 2 for BreadSticks");
                    System.out.println("Enter 3 for CheeseSticks");
                    System.out.println("Enter 4 for Stuffed Pizza Rollers");
                    System.out.println("Enter 5 for Pepperoni P'Zone@Pizza");
                    int ch5=Integer.parseInt(in.readLine());
                    if(ch5 >0 && ch5<14)
                        System.out.println("\f");
                    switch(ch5)
                    {
                        case 1:
                        /* Veg Baked Pasta of Veg of Classics of Menu */
                        System.out.println("Contains Spicy Tomato Sauce with Mozzarella Cheese, Onion, Capsicum and Chopped Parsley mixed with Fussilli Pasta.");
                        System.out.println("Costs Rs. 125");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String E=in.readLine();
                        AAA=125;
                        back(E,AAA);
                        break;                        
                        case 2:
                        /* BreadSticks of Veg of Classics of Menu */
                        System.out.println("It is crispy on the outside, soft and chewy on the inside. ");
                        System.out.println("Costs Rs. 75");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String N=in.readLine();
                        AAA=75;
                        back(N,AAA);
                        break;
                        case 3:
                        /* CheeseSticks of Veg of Classics of Menu */
                        System.out.println("Fresh, oven-baked dough smothered with cheese and sprinkled with Italian seasoning. Served with marinara.");
                        System.out.println("Costs Rs. 79");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String O=in.readLine();
                        AAA=79;
                        back(O,AAA);
                        break;
                        case 4:
                        /* Stuffed Pizza Rollers of Veg of Classics of Menu */
                        System.out.println("Jumbo, fluffy rollers stuffed with pepperoni & 100% real cheese made from Mozzarella");
                        System.out.println("Costs Rs. 85");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String P=in.readLine();
                        AAA=85;
                        back(P,AAA);
                        break;
                        case 5:
                        /* Pepperoni P'Zone@Pizza of Veg of Classics of Menu */
                        System.out.println("If pepperoni's your passion - lots and lots of pepperoni - this is your P'Zone. Served with zesty marinara on the side.");
                        System.out.println("Costs Rs. 89");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String Q=in.readLine();
                        AAA=89;
                        back(Q,AAA);
                        break;
                        default:
                        System.out.println("Wrong Choice");
                        System.out.println();
                        info();
                    }
                    break;
                    case 2:
                    /* Non Veg of Classics of Menu */
                    System.out.println("Enter 1 for Chicken Baked Pasta");
                    System.out.println("Enter 2 for Chicken Wings");
                    System.out.println("Enter 3 for Meaty P'Zone® Pizza");
                    System.out.println("Enter 4 for Supremo P'Zone® Pizza");
                    int ch6=Integer.parseInt(in.readLine());
                    if(ch6>0 && ch6<5)
                        System.out.println("\f");
                    switch(ch6)
                    {
                        case 1:
                        /* Chicken Baked Pasta of Non Veg of Classics of Menu */
                        System.out.println("Contains Spicy Tomato Sauce with Mozzarella Cheese, Chopped Chicken, Onion, Capsicum and Chopped Parsley mixed with Fussilli Pasta.");
                        System.out.println("Costs Rs. 145");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String AD=in.readLine();
                        AAA=145;
                        back(AD,AAA);
                        break;
                        case 2:
                        /* Chicken Wings of Non Veg of Classics of Menu */
                        System.out.println("Contains 6 piece of tender, juicy chicken wings tossed in spicy BBQ sauce.");
                        System.out.println("Costs Rs. 149");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String AE=in.readLine();
                        AAA=149;
                        back(AE,AAA);
                        break;
                        case 3:
                        /* Meaty P'Zone® Pizza of Non Veg of Classics of Menu */
                        System.out.println("It's multi-meat mayhem in there. Stuffed with all your favorites - pepperoni, ham, Italian sausage, pork and beef");
                        System.out.println("Costs Rs. 155");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String AF=in.readLine();
                        AAA=155;
                        back(AF,AAA);
                        break;
                        case 4:
                        /* Supremo P'Zone® Pizza of Non Veg of Classics of Menu */
                        System.out.println("In this, Savory Italian sausage mixes with fresh green peppers and red onions in this meat-and-veggie combo. ");
                        System.out.println("Costs Rs. 135");
                        System.out.println("Do you want to buy??? Type yes else no");
                        String AG=in.readLine();
                        AAA=135;
                        back(AG,AAA);
                        break;
                        default:
                        System.out.println("Wrong Choice");
                        System.out.println();
                        info();
                    }
                    break;
                    default:
                    System.out.println("Wrong Choice");
                    System.out.println();
                    info();
                }
                break;
                case 3:
                /* Meals of Menu*/
                System.out.println("Enter 1 for one person");
                System.out.println("Enter 2 for two persons");
                System.out.println("Enter 3 for four persons");
                System.out.println("Enter 4 for The Big Meal");
                System.out.println("Enter 5 for Hut Meal Deal");
                System.out.println("Enter 6 for Veggie Meal for two persons");
                System.out.println("Enter 7 for Paneer Meal for two persons");
                System.out.println("Enter 8 for Non Veg Meal for two persons");
                System.out.println("Enter 9 for Big Pizza Garlic Bread Stix Meal for two persons");
                int ch7=Integer.parseInt(in.readLine());
                if(ch7>0 && ch7<10)
                    System.out.println("\f");
                switch(ch7)
                {
                    case 1:
                    System.out.println("Contains Paneer Birizza + Plain Garlic Bread (2pc) + Pepsi");
                    System.out.println("Costs Rs. 199.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String R=in.readLine();
                    AAA=199;
                    back(R,AAA);
                    break;
                    case 2:
                    System.out.println("Contains Medium Pizza + Any Garlic Bread + Pepsi");
                    System.out.println("Costs Rs. 449.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String S=in.readLine();
                    AAA=499;
                    back(S,AAA);
                    break;
                    case 3:
                    System.out.println("Contains 2 Medium Pizzas + Any Garlic Bread + Any 2 Desserts");
                    System.out.println("Costs Rs. 799.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String T=in.readLine();
                    AAA=799;
                    back(T,AAA);
                    break;
                    case 4:
                    System.out.println("Contains Any Veg Big Pizza + Any Garlic Bread + Any Drink");
                    System.out.println("Costs Rs. 299.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String U=in.readLine();
                    AAA=299;
                    back(U,AAA);
                    break;
                    case 5:
                    System.out.println("Contains Any Medium Pizza + Any Garlic Bread + Any Dessert");
                    System.out.println("Costs Rs. 499.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String V=in.readLine();
                    AAA=499;
                    back(V,AAA);
                    break;
                    case 6:
                    System.out.println("Contains Veg Birizza + Veg Personal Pan Pizza (classic, favorite or signature) + Pepsi 600 ml pet bottle");
                    System.out.println("Costs Rs. 299.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String W=in.readLine();
                    AAA=299;
                    back(W,AAA);
                    break;
                    case 7:
                    System.out.println("Contains Paneer Birizza + Veg Personal Pan Pizza (classic, favorite or signature) + Pepsi 600 ml pet bottle ");
                    System.out.println("Costs Rs. 329.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String X=in.readLine();
                    AAA=329;
                    back(X,AAA);
                    break;
                    case 8:
                    System.out.println("Contains Chicken Birizza + Veg Personal Pan Pizza (classic, favorite or signature) + Pepsi 600 ml pet bottle");
                    System.out.println("Costs Rs. 349.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String Y=in.readLine();
                    AAA=349;
                    back(Y,AAA);
                    break;
                    case 9:
                    System.out.println("Contains I Medium Big Pizza + 1 portion of Garlic Bread Stix and 1 Beverage(Rs.60 extra per pizza of Non Veg)");
                    System.out.println("Costs Rs. 299.00 only");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String Z=in.readLine();
                    AAA=299;
                    back(Z,AAA);
                    break;
                    default:
                    System.out.println("Wrong Choice");
                    System.out.println();
                    info();
                    break;
                }
                case 4:
                /* Sides of Menu*/
                System.out.println("\f");
                System.out.println("Enter 1 for Garlic Bread Stix");
                System.out.println("Enter 2 for Garlic Bread Plain");
                System.out.println("Enter 3 for Garlic Bread Cheese");
                System.out.println("Enter 4 for Garlic Bread Spicy Supreme");
                System.out.println("Enter 5 for Garlic Bread Exotica");
                System.out.println("Enter 6 for Garlic Bread Spicy Exotica");
                System.out.println("Enter 7 for Potato Wedges");
                System.out.println("Enter 8 for Cheesy Jalapeno Dip");
                int ch10=Integer.parseInt(in.readLine());
                if(ch10>0 && ch10<9)
                    System.out.println("\f");
                switch(ch10)
                {
                    case 1:
                    /* Garlic Bread Stix of Veg of Sides of Menu */
                    System.out.println("Contains Freshly Baked, Buttery Garlic Bread Sticks served with Cheese!");
                    System.out.println("Costs Rs. 99");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String F=in.readLine();
                    AAA=135;
                    back(F,AAA);
                    break;
                    case 2:
                    /* Garlic Bread Plain of Veg of Sides of Menu */
                    System.out.println("Contains 4 Pieces of Garlic Bread");
                    System.out.println("Costs Rs. 79");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String G=in.readLine();
                    AAA=79;
                    back(G,AAA);
                    break;
                    case 3:
                    /* Garlic Bread Cheese of Veg of Sides of Menu */
                    System.out.println("Contains Garlic Bread with Cheese");
                    System.out.println("Costs Rs. 99");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String H=in.readLine();
                    AAA=99;
                    back(H,AAA);
                    break;
                    case 4:
                    /* Garlic Bread Spicy Supreme of Veg of Sides of Menu */
                    System.out.println("Contains Garlic bread with cheese, onions and green chillies.");
                    System.out.println("Costs Rs. 119");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String I=in.readLine();
                    AAA=119;
                    back(I,AAA);
                    break;
                    case 5:
                    /* Garlic Bread Exotica of Veg of Sides of Menu */
                    System.out.println("Contains Garlic bread with cheese, olives, jalapenos, tomato, onion and balsamic vinegar.");
                    System.out.println("Costs Rs. 119");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String J=in.readLine();
                    AAA=119;
                    back(J,AAA);
                    break;
                    case 6:
                    /* Garlic Bread Spicy Exotica of Veg of Sides of Menu */
                    System.out.println("Contains Onion, Tomato, Jalapeno, Coriander, Garlic Butter, Mozzarella Cheese");
                    System.out.println("Costs Rs. 125");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String K=in.readLine();
                    AAA=125;
                    back(K,AAA);
                    break;
                    case 7:
                    /* Potato Wedges of Veg of Sides of Menu */
                    System.out.println("Contains Crispy potato wedges seasoned with a tinge of garlic! ");
                    System.out.println("Costs Rs. 89");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String L=in.readLine();
                    AAA=89;
                    back(L,AAA);
                    break;
                    case 8:
                    /* Cheesy Jalapeno Dip of Veg of Sides of Menu */
                    System.out.println("Costs Rs. 20");
                    System.out.println("Do you want to buy??? Type yes else no");
                    String M=in.readLine();
                    AAA=20;
                    back(M,AAA);
                    break;
                    default:
                    System.out.println("Wrong Choice");
                    System.out.println();
                    info();
                }
            }
            break;    
            case 2:
            /* Nutrition */
            {
                System.out.println("At Pizza Hut, we take great pride and care to provide you with the best food ");
                System.out.println("and experience in the pizza business by only using the freshest of ingredients ");
                System.out.println("when making your pizza.");
                System.out.println("");
                System.out.println("We are so serious about pizza that we make our pizza bases in store every day ");
                System.out.println("with Australian made flour using only Australian grain.");
                System.out.println("");
                System.out.println("We believe eating sensibly, combined with appropriate exercise, is the best");
                System.out.println("solution for a balanced lifestyle.");
                System.out.println("");
                System.out.println("Pizza can be a part of a well-balanced meal.");
                System.out.println("");
                System.out.println("Ingredients in our pizzas include protein, complex carbohydrates,Vitamin A ");
                System.out.println("and calcium.");
                System.out.println("");
                System.out.println("And, depending on the toppings you choose, our pizzas have items from all of ");
                System.out.println("the four major food groups - meat, dairy products, fruits and vegetables, ");
                System.out.println("and grains! ");
                System.out.println();
                info();
            }
            break;
            case 3:
            /* Work with us */
            {
                System.out.println("Want to know what it's like to join the team that's famous for a reason?");
                System.out.println("");
                System.out.println("1. It's about flexible hours, working hard, having fun, making friends and ");
                System.out.println("earning money. ");
                System.out.println("");
                System.out.println("2. It's about independence and confidence- and learning a lot more about");
                System.out.println("who you are.");
                System.out.println("");
                System.out.println("3. You can be a driver, store team-member, manager or work in our call ");
                System.out.println("centre in Brisbane. And, if you want, you can work your way right to the ");
                System.out.println("top, or even end up owning your own store!");
                System.out.println("");
                System.out.println("Take a look around. ");
                System.out.println("");
                System.out.println("If you see a position that suits we'll guide you through the application ");
                System.out.println("process.");
                System.out.println("");
                System.out.println("Take it away!");
                System.out.println();
                info();
            }
            break;
            case 4:
            /* Franchising */
            {
                System.out.println("We believe there has never been a more exciting time to be part of Pizza ");
                System.out.println("Hut Australia.");
                System.out.println("Pizza Hut is the world's largest pizza restaurant company with more than");
                System.out.println("12,000 restaurants in over 80 countries and territories around the world");
                System.out.println("and is the recognized leader in the pizza category.");
                System.out.println("Andy Masood (Head of Development) believes Pizza Hut is in a very ");
                System.out.println("exciting position.");
                System.out.println("At Pizza Hut we have over 30 year experience in building great franchise ");
                System.out.println("partnerships. ");
                System.out.println("Over the past few years we have many examples of new franchisees joining ");
                System.out.println("our brand, each bringing unique insights, skills and experiences from");
                System.out.println("diverse backgrounds.");
                System.out.println("We fundamentally believe in the power of a 'one-system' approach to ");
                System.out.println("franchising.");
                System.out.println("We have the strength of a global, national and local team in place to ");
                System.out.println("help continue to develop the Pizza Hut brand and enable our franchise ");
                System.out.println("partners to deliver operational excellence and ultimately build");
                System.out.println("profitable businesses.");
                System.out.println("");
                System.out.println("Pizza Hut takes franchisee recruitment very seriously.");
                System.out.println("We operate as one system and we want a network of successful partners");
                System.out.println("we seek individuals who have:");
                System.out.println("•   A desire to be Owner Operator's");
                System.out.println("•   Belief in the brand");
                System.out.println("•   Entrepreneurial spirit");
                System.out.println("•   A high level of commitment to customer service");
                System.out.println("•   Vision and enthusiasm for the long term growth of their business");
                System.out.println("•   Retail and/or fast food experience is desirable but not necessary");
                System.out.println();
                info();
            }
            break;
            case 5:
            /* about Us*/
            {
                System.out.println("In 1958, Frank and Dan Carney were students at Wichita State University,");
                System.out.println("in Wichita, Kansas, USA.");
                System.out.println("");
                System.out.println("Dan, at 25, was working on his master's degree in Business Administration ");
                System.out.println("and Frank was a 19-year-old undergraduate thinking of a career in");
                System.out.println("Electrical Engineering. ");
                System.out.println("");
                System.out.println("They worked evenings and weekends in the family grocery store when, as");
                System.out.println("Frank recalls…");
                System.out.println("");
                System.out.println("“... our landlady became concerned about complaints she was getting on");
                System.out.println("the clientele of the tavern next to our family's grocery store. ");
                System.out.println("");
                System.out.println("She wanted a nice neighbourhood business to occupy her building. ");
                System.out.println("");
                System.out.println("Having read an article on the growing popularity of pizza in the");
                System.out.println("Saturday Evening Post, she approached Dan and me with the idea of ");
                System.out.println("opening a pizza place in her building. ");
                System.out.println("");
                System.out.println("Although pizza was relatively unknown in Wichita at the time, we decided ");
                System.out.println("that it just might work." );
                System.out.println("");
                System.out.println("On June 13, 1958 the first Pizza Hut Restaurants opened. ");
                System.out.println("");
                System.out.println("By September it was grossing $700 to $800 a week, by December, over ");
                System.out.println("$1,000 a week Pizza Hut restaurants number two and three soon followed.");
                System.out.println("");
                System.out.println("Franchising began in 1959 when Dick Hassur, Manager of Pizza Hut Unit No.");
                System.out.println("3 signed the first Franchise Agreement. ");
                System.out.println("");
                System.out.println("For a fee, he would have the right to use the Pizza Hut name and 'secret'");
                System.out.println("recipes.");
                System.out.println("");
                System.out.println("He also would receive management assistance from the Carneys. ");
                System.out.println("");
                System.out.println("Pizza Hut Restaurants were patterned for growth. ");
                System.out.println("");
                System.out.println("In 14 years (1958-1972) franchise and company Restaurants numbered 1,000. ");
                System.out.println("");
                System.out.println("In the next three years (1972-1977) they numbered 3,000. ");
                System.out.println("");
                System.out.println("Home delivery is a fast growing segment of the pizza market worldwide, and");
                System.out.println("Pizza Hut Delivery was developed in 1985 to compete aggressively in this");
                System.out.println("highly competitive market.");
                System.out.println("");
                System.out.println("Today, Pizza Hut is the largest pizza chain in the world with more than ");
                System.out.println("12,000 Pizza Hut Restaurants and Delivery Units operating worldwide.");
                System.out.println("");
                System.out.println("Approximately 270 stores are located in Australia.");
                System.out.println();
                info();
            }
            break;
            case 6:
            /* Contact us */
            {
                System.out.println("Ordering Hotlines  National - 1300 PIZZA HUT (1300 749 924)");
                System.out.println();
                info();
            }
            break;
            case 7:
            /* FAQ's */
            {
                System.out.println("1.  Can I use coupons through Pizza Hut Online?");
                System.out.println("2.  Why does the delivery time change?");
                System.out.println("3.  Why isn't internet ordering available at my local store?");
                System.out.println("4.  Why won't the system accept my address?");
                System.out.println("5.  Why is delivery $8 extra?");
                System.out.println("6.  Can I pay by cheque?");
                System.out.println("7.  Will I still receive my order if I didn't get my confirmation number?");
                System.out.println("8.  How will I know that my credit card details will be kept secure?");
                System.out.println("9.  What number should I call if I can't make the website work?");
                System.out.println("10. What will you do with my address details?");
                System.out.println("Enter the question number whose answer you want");
                int ch4=Integer.parseInt(in.readLine());
                System.out.println("\f");
                switch(ch4)
                {
                    case 1:
                    {
                        System.out.println("Sometimes, Pizza Hut Online already provides great value without the");
                        System.out.println("need for a coupon & pizza prices are already discounted. ");
                        System.out.println("");
                        System.out.println("From time to time we do make online specific coupons availble. ");
                        System.out.println("");
                        System.out.println("When available these coupons clearly comunicate that they are online");
                        System.out.println("coupons. ");
                        System.out.println("");
                        System.out.println("Before selecting your order, enter the code into the ‘Coupon Code’ box");
                        System.out.println("in the ‘Offers’ section on the left hand side of the ordering page and");
                        System.out.println("press ‘Redeem’. ");
                        System.out.println("");
                        System.out.println("Then simply follow the prompts to add your order to the basket. ");
                        System.out.println("");
                        System.out.println("Please note not all online coupons are available for all stores.");
                        System.out.println();
                        info();
                    }
                    break;
                    case 2:
                    {
                        System.out.println("The quoted time for any store changes based on many factors including road");
                        System.out.println("traffic conditions and the number of orders the store has. ");
                        System.out.println("");
                        System.out.println("In order to give you the accurate time we quote the expected time at the ");
                        System.out.println("start of your order and again when you confirm it, that way you always have");
                        System.out.println("the most up to date time. ");
                        System.out.println();
                        info();
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Not all stores have the ability to connect to online ordering at this stage,");
                        System.out.println("however we are working to have them all connected as quickly as possible.");
                        System.out.println();
                        info();
                    }
                    break;
                    case 4:
                    {
                        System.out.println("We try our best to keep our address listings up to date, however some streets");
                        System.out.println("are listed in various formats, eg Mount/Mt making this hard to do.");
                        System.out.println("");
                        System.out.println("We also have a limited delivery area to ensure we deliver to our customers ");
                        System.out.println("the freshest possible pizza. ");
                        System.out.println("");
                        System.out.println("If your address is not accepted you can call our technical support number on ");
                        System.out.println("1300 367 588.");
                        System.out.println();
                        info();
                    }
                    break;
                    case 5:
                    {
                        System.out.println("Our delivery price online is the same nationally and may differ from your local");
                        System.out.println("store pricing.");
                        System.out.println();
                        info();
                    }
                    break;
                    case 6:
                    {
                        System.out.println("Unfortunately no, you can pay online via credit card, or by cash when your order");
                        System.out.println("is delivered or you pick it up. ");
                        System.out.println("");
                        System.out.println("Pizza Hut does not accept cheques as a payment option.");
                        System.out.println();
                        info();
                    }
                    break;
                    case 7:
                    {
                        System.out.println("Unfortunately no, the confirmation number is your confirmation that your order has");
                        System.out.println("been processed through your selected store.");
                        System.out.println("");
                        System.out.println("If you do not get a confirmation number back you should ring our Customer Service");
                        System.out.println("Hotline on 1300 367 588. ");
                        System.out.println();
                        info();
                    }
                    break;
                    case 8:
                    {
                        System.out.println("When you order products through this website we use a secure server. ");
                        System.out.println("Secure Sockets Layer (SSL) encrypts the information you send when you place an order");
                        System.out.println("through this website.");
                        System.out.println("For further details you can view the Privacy Policy available on this site.");
                        System.out.println();
                        info();
                    }
                    break;
                    case 9:
                    {
                        System.out.println("If you are having troubles with ordering through the website please call our");
                        System.out.println("Customer Service Hotline on 1300 367 588. ");
                        System.out.println();
                        info();
                    }
                    break;
                    case 10:
                    {
                        System.out.println("Pizza Hut may use your personal information for various needs including placing your order and reviewing the needs of our website and how we can improve it. ");
                        System.out.println("For further details you can view the Privacy Policy available on this site. ");
                        System.out.println();
                        info();
                    }
                    break;
                    default:
                    System.out.println("Wrong Choice");
                    System.out.println();
                    info();
                    break;
                }
            }
            break;
            case 8:
            /* Terms and Conditions */
            {
                System.out.println("These Terms and Conditions of Use govern your use of this web site and your");
                System.out.println("use of this web site indicates your acceptance of these Terms and Conditions.");
                System.out.println("PIZZA HUT may from time to time amend, update or change this web site including");
                System.out.println("these Terms and Conditions without prior notice. ");
                System.out.println();
                System.out.println("Privacy");
                System.out.println("Refer to the Privacy Policy and Use of Web Site, which form part of these Terms");
                System.out.println("and Conditions of Use.");
                System.out.println();
                System.out.println("Information on Website");
                System.out.println("Publishing information about a product on this Website does not ensure its");
                System.out.println("availability.");
                System.out.println("Products are advertised subject to availability.");
                System.out.println("Price information is subject to change without notice. ");
                System.out.println("PIZZA HUT does not undertake to keep this web site updated. ");
                System.out.println("PIZZA HUT is not liable to you or anyone else if errors occur in the");
                System.out.println("information on this web site or if that information is not up to date. ");
                System.out.println();
                System.out.println("Links to other web sites");
                System.out.println("PIZZA HUT may provide links to web sites not operated by PIZZA HUT.");
                System.out.println("These linked sites are not under the control of PIZZA HUT, and we are not ");
                System.out.println("responsible for the privacy practices or content of companies linked to");
                System.out.println("our web site. ");
                System.out.println("Before disclosing your personal information on any other web site, we advise");
                System.out.println("you to examine the privacy policies of those web sites. ");
                System.out.println();
                System.out.println("Franchisee web sites");
                System.out.println("Many PIZZA HUT outlets are owned and operated by franchisees. ");
                System.out.println("Some franchisees may also operate web sites. ");
                System.out.println("We encourage franchisees to follow this Privacy Policy but they are not");
                System.out.println("obliged to do so.");
                System.out.println();
                System.out.println("Intellectual Property Rights");
                System.out.println("All material contained on this web site is the property of PIZZA HUT and");
                System.out.println("its affiliates and protected by copyright. ");
                System.out.println("Except as permitted by relevant copyright legislation or with the prior");
                System.out.println("written approval of PIZZA HUT or its affiliates, the material may not be ");
                System.out.println("otherwise used, copied, reproduced, published, stored in a retrieval");
                System.out.println("system, altered, transmitted in any form or by any means in whole or in part. ");
                System.out.println("The trade marks appearing on this web site are primarily trade marks of PIZZA ");
                System.out.println("HUT, Pizza Hut International, LLC or their affiliates.");
                System.out.println("Other trade marks displayed on this web site are trade marks of their respective");
                System.out.println("owners. ");
                System.out.println("The trade marks must not be used or modified in any way without the express");
                System.out.println("written permission of PIZZA HUT or the relevant affiliate or third party owner. ");
                System.out.println();
                System.out.println("Reviews and Comments");
                System.out.println("PIZZA HUT enables visitors to its web site to post reviews of and comments on this");
                System.out.println("web site.");
                System.out.println("If you post reviews or comments on this web site, you grant PIZZA HUT and its ");
                System.out.println("affiliates a right to use, reproduce, modify, distribute and display such reviews");
                System.out.println("and comments throughout the world in any media. ");
                System.out.println();
                System.out.println("Disclaimer");
                System.out.println("Your use of the material contained on this web site is at your sole risk.");
                System.out.println("Any information and data is provided on an as is basis and excludes any warranties");
                System.out.println("which may be excluded by law. ");
                System.out.println("PIZZA HUT reserves to itself the right to change any of the material on this web ");
                System.out.println("site at any time. ");
                System.out.println();
                System.out.println("Limitation of Liability");
                System.out.println("To the extent permitted by law, PIZZA HUT’s liability in relation to any product");
                System.out.println("or service purchased as a consequence of your use of this web site is limited to");
                System.out.println("the lesser of:");
                System.out.println("(a) the replacement of any product purchased; and ");
                System.out.println("(b) the purchase price paid by you to PIZZA HUT for the product or service.");
                System.out.println("To the extent permitted by law we will not be liable for any direct, incidental,");
                System.out.println("cnsequential or indirect damages, ");
                System.out.println("loss or corruption of data, loss of profits, goodwill, bargain or opportunity");
                System.out.println("or loss of anticipated savings resulting from your access to, or use of, or ");
                System.out.println("inability to use this web site and the content,");
                System.out.println("whether based on warranty, contract, tort, negligence or any other legal theory,");
                System.out.println("and whether or not we know of the possibility of such damage. ");
                System.out.println("If a jurisdiction does not allow the exclusion or limitation of liability in ");
                System.out.println("accordance with this paragraph but allows a limitation of a certain maximum");
                System.out.println("extent then our liability is limited to that extent. ");
                System.out.println();
                System.out.println("Governing Law");
                System.out.println("The laws of the State of New South Wales and the Commonwealth of Australia");
                System.out.println("govern this web site. ");
                System.out.println("This Website may be accessed throughout Australia and overseas. ");
                System.out.println("PIZZA HUT makes no representations or warranties that the content of this web");
                System.out.println("site complies with the laws (including intellectual property laws) of any country");
                System.out.println("outside Australia.");
                System.out.println("If you access this web site from outside Australia, you do so on your own ");
                System.out.println("responsibility and are responsible for ensuring compliance with all laws in the ");
                System.out.println("place where you are located.");
                System.out.println();
                info();
            }
            break;
            case 9:
            /* Latest */
            {
                System.out.println("Order Online");
                System.out.println("Pizza Hut's online ordering allows customers order pizzas online for an all day ");
                System.out.println("every day low price without the need of a coupon.");
                System.out.println("");
                System.out.println("iPhone App");
                System.out.println("Hungry for your favorite Pizza Hut pizza, pasta and sides? Experience a deliciously");
                System.out.println("fun distraction when you order with the Pizza Hut iPhone App.");
                System.out.println("Drag it, tap it, tilt it, slide it, turn it, find it, play it, save it, and enjoy");
                System.out.println("it - ordering from the Pizza Hut menu has never been so EASY, FAST or FUN when you ");
                System.out.println("unleash the power of our Application.");
                System.out.println();
                info();
            }
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println();
            info();
            break;
        }
    }

    public void back(String A, int a) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);        
        if(A.compareTo("yes")==0)
            bill=bill+a;
        System.out.println("Press 1 to go back or 0 to exit .......");
        int x=Integer.parseInt(in.readLine());
        if(x==1)
            content();
        else
            System.out.println("Wrong Choice");            
        if(x==0)
        {
            System.out.println("Your bill is Rs. "+bill);
            System.out.println("Enter 1 to finally exit");
            int y=Integer.parseInt(in.readLine());
            if(y==1)
                end();
        }
    }

    public void end()
    {
        System.out.println("\f");
        for(int i=0;i<=9;i++)
        {
            System.out.print("\f\n\n\n\n\n");
            System.out.println("    ^ ^ ^ ^ ^    ^       ^        ^        ^       ^    ^    ^         ^     ^    ^ ^ ^ ^    ^       ^  ");
            System.out.println("        ^        ^       ^       ^ ^       ^ ^     ^    ^  ^            ^   ^     ^     ^    ^       ^       ");
            System.out.println("        ^        ^ ^ ^ ^ ^      ^ ^ ^      ^   ^   ^    ^ ^               ^       ^     ^    ^       ^        ");
            System.out.println("        ^        ^       ^     ^     ^     ^     ^ ^    ^  ^              ^       ^     ^     ^     ^        ");
            System.out.println("        ^        ^       ^    ^       ^    ^       ^    ^    ^            ^       ^ ^ ^ ^       ^ ^ ");
            System.out.println();
            System.out.println();
            for(int j=0;j<=i;j++)
                System.out.print("\t "+(char)9786 );
            for(int j=i;j<=8;j++)
                System.out.print("\t "+(char)9787 );
            for(int t=0;t<1000000000;t++)
            {

            }
        }
        System.out.println("\f");
    }

    public void info() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Press 1 to go back or 0 to exit ......");
        int x=Integer.parseInt(in.readLine());
        if(x==1)
            content();
        else
        {
            System.out.println("Your bill is Rs. "+bill);
            System.out.println("Press and key to finally exit .......");
            String y=in.readLine();
            end();
        }
    }
}