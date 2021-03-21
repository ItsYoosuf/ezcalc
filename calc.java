import java.io.*;
class calc
    {
        public static double add(double x,double y)
            {
                double tot =0.00;double a=x;double b=y;
                tot = a+b;
                return tot;
            }
        public static double subtract(double x,double y)
            {
             double tot = 0.00; double a = x; double b =y;
             tot = a-b;
             return  tot;
            }
        public static double mult(double x,double y)
            {
             double tot = 0.00; double a = x; double b =y;
             tot = a*b;
             return tot;
            }
        public static double div(double x, double y)
            {
                double tot = 0.00; double a = x; double b =y;
                tot = a/b;
                return tot;
            }
        public static void main()throws IOException
            {
                BufferedReader I = new BufferedReader(new InputStreamReader(System.in));
                calc X= new calc();
                System.out.println("Menu.");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("Exit");
                System.out.println("Choose your option");
                int y=Integer.parseInt(I.readLine());
                double l,m,n=0;
                if(y==1)
                    {
                        System.out.println("Enter your First Number");
                        l=Double.parseDouble(I.readLine());
                        System.out.println("Enter your Second Number");
                        m=Double.parseDouble(I.readLine());
                        n=X.add(l,m);
                        System.out.println(n);
                    }
                else if(y==2)
                    {
                        System.out.println("Enter your First Number");
                        l=Double.parseDouble(I.readLine());
                        System.out.println("Enter your Second Number");
                        m=Double.parseDouble(I.readLine());
                        n=X.subtract(l,m);
                        System.out.println(n);
                    }
                else if(y==3)
                    {
                        System.out.println("Enter your First Number");
                        l=Double.parseDouble(I.readLine());
                        System.out.println("Enter your Second Number");
                        m=Double.parseDouble(I.readLine());
                        n=X.mult(l,m);
                        System.out.println(n);
                    }
                else if(y==4)
                    {
                        System.out.println("Enter your First Number");
                        l=Double.parseDouble(I.readLine());
                        System.out.println("Enter your Second Number");
                        m=Double.parseDouble(I.readLine());
                        n=X.div(l,m);
                        System.out.println(n);
                    }
                else if(y==5)
                    {
                        System.out.println("Thank You");
                    }
                else
                    {
                        System.out.println("Wrong Input");
                    }
                }
            }