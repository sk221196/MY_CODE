import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t***WELCOME TO KGF MART***");
        int n,m,num=0,i,ti=0,x=0;
        ArrayList<String> c_id = new ArrayList<String>();
        ArrayList<String> c_pwd = new ArrayList<String>();
        ArrayList<Boolean> c_f = new ArrayList<Boolean>();
        ArrayList<String> st_name = new ArrayList<String>();
        ArrayList<Integer> st_qty = new ArrayList<Integer>();
        ArrayList<Integer> st_price = new ArrayList<Integer>();
        ArrayList<String> st_id = new ArrayList<String>();
        ArrayList<Boolean> st_f = new ArrayList<Boolean>();
        
        int ca=0;
        do
        {
            System.out.println("\nPress"+"\n"+"1.Owner"+"\n"+"2.Cashier"+"\n"+"3.Exit");
            n=sc.nextInt();
            if(n==1)
            {
                System.out.println("1.Report"+"\n"+"2.Add Cashier"+"\n"+"3.List of Cashier");
                m=sc.nextInt();
                    if(m==1)
                    {
                        boolean flag2=true;
                        System.out.println("List of Items");
                        for(i=0;i<st_id.size();i++)
                        {
                            if(st_f.get(i))
                            {
                                System.out.println(st_name.get(i)+" "+st_id.get(i)+" "+st_price.get(i)+" "+st_qty.get(i));
                                flag2=false;
                            }
                        }
                    
                    }
                    if(m==2)
                    {
                        System.out.print("Number of Cashier:");
                        num=sc.nextInt();
                        for(i=ca;i<num+ca;i++)
                        {
                            System.out.print("Cashier ID:");
                            c_id.add(sc.next());
                            System.out.print("Cashier Password:");
                            c_pwd.add(sc.next());
                            c_f.add(true);
                            //ca++;
                        }
                    }
                    if(m==3)
                    {
                        boolean flag1=true;
                        System.out.println("Cashier List");
                        for(i=0;i<c_id.size();i++)
                        {
                            if(c_f.get(i))
                            {
                                System.out.println(c_id.get(i));
                                flag1=false;
                            }
                        }
                    }
            }
            if(n==2)
            {
                
                System.out.print("Enter Cashier ID:");
                String t1=sc.next();
                System.out.print("Enter Cashier Password:");
                String t2=sc.next();
                int l,st,no;
                boolean fg=false;
                for(i=0;i<num;i++)
                {
                    if( (t1.equals(c_id.get(i))) && (t2.equals(c_pwd.get(i))) )
                    {
                        fg=true;
                        do
                        {
                            System.out.println("\nPress"+"\n"+"1.Stock Entry"+"\n"+"2.Bill Entry"+"\n"+"3.Exit");
                            l=sc.nextInt();
                            if(l==1)
                                {
                                    System.out.println("\nPress"+"\n"+"1.Add"+"\n"+"2.Update"+"\n"+"3.Delete");
                                    st=sc.nextInt();
                                        if(st==1)
                                        {
                                            System.out.print("Number of Items:");
                                            no=sc.nextInt();
                                            for(i=0;i<no;i++)
                                            {
                                                System.out.print("Product Name:");
                                                st_name.add(sc.next());
                                                System.out.print("Price:");
                                                st_price.add(sc.nextInt());
                                                System.out.print("Quntity:");
                                                st_qty.add(sc.nextInt());
                                                System.out.print("Product ID:");
                                                st_id.add(sc.next());
                                                st_f.add(true);
                                            }
                                            ti+=no;
                                        }
                                        if(st==2)
                                        {
                                            System.out.print("Enter Product Id to Add or change:");
                                            for(i=0;i<ti;i++)
                                            {
                                                if(sc.next().equals(st_id.get(i)))
                                                {
                                                    System.out.print("Product Name:");
                                                    st_name.set(i,sc.next());
                                                    System.out.print("Price:");
                                                    st_price.set(i,sc.nextInt());
                                                    System.out.print("Quntity:");
                                                    int rr=sc.nextInt();
                                                    rr+=st_qty.get(i);
                                                    st_qty.set(i,rr);
                                                }
                                            }
                                        }
                                        if(st==3)
                                        {
                                            System.out.print("Enter Product Id to Delete:");
                                            for(i=0;i<ti;i++)
                                            {
                                                if(sc.next().equals(st_id.get(i)))
                                                {
                                                    st_name.remove(i);
                                                    st_id.remove(i);
                                                    st_qty.remove(i);
                                                    st_price.remove(i);
                                                    System.out.println("Product Removed");
                                                }
                                            }
                                        }
                                }
                                if(l==2)
                                {
                                       
                                  System.out.print("Enter Product Id:");
                                  String pi=sc.next();
                                  for(i=0;i<ti;i++)
                                  {
                                      if(pi.equals(st_id.get(i)))
                                      {
                                          System.out.print("Quntity:");
                                          int qun=sc.nextInt();
                                          int Bill =qun*st_price.get(i);
                                          System.out.print("Total Bill:");
                                          System.out.print(Bill);
                                          qun = st_qty.get(i)-qun;
                                          st_qty.set(i,qun);
                                      }
                                  }
                                  //x=i;
                                }
                                else if(l==3)
                                {
                                    break;
                                }
                        }while(true);
                    }
                }
                if(!fg)
                {
                    System.out.println("Wrong ID or Password");
                }
            }
            if(n==3)
            {
                System.out.println("\t\t\t***Thank you for Shopping***");
                break;
            }
            
        }while (true);
    }
}





