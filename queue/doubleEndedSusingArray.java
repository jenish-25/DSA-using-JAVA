package queue;

import java.util.Scanner;

public class doubleEndedSusingArray {
    public static void main(String[] args) {
                int size=5;
                int arr[]=new int[size],R=-1,F=0,te=0,ch,n,i,x;
                Scanner sc=new Scanner(System.in);

                for(;;)		// An infinite loop
                {
                    System.out.println("F=" + F + "  R=" + R);
                    System.out.println("\n\n1. Add Rear");
                    System.out.println("2. Delete Rear");
                    System.out.println("3. Add Front");
                    System.out.println("4. Delete Front");
                    System.out.println("5. Display");
                    System.out.println("6. Exit");
                    System.out.print("Enter Choice: ");
                    ch=sc.nextInt();

                    switch(ch)
                    {
                        case 1:
                            if(te==size)
                            {
                                System.out.println("Queue is full");
                            }
                            else
                            {
                                System.out.print("Enter a number ");
                                n=sc.nextInt();
                                R=(R+1)%size;
                                arr[R]=n;
                                te=te+1;
                            }
                            break;

                        case 2:
                            if(te==0)
                            {
                                System.out.println("Queue is empty");
                            }
                            else
                            {
                                if(R==-1)
                                {
                                    R=size-1;
                                }
                                System.out.println("Number Deleted From Rear End = " + arr[R]);
                                R=R-1;
                                te=te-1;
                            }
                            break;

                        case 3:
                            if(te==size)
                            {
                                System.out.println("Queue is full");
                            }
                            else
                            {
                                System.out.println("Enter a number ");
                                n=sc.nextInt();
                                if(F==0)
                                {
                                    F=size-1;
                                }
                                else
                                {
                                    F=F-1;
                                }
                                arr[F]=n;
                                te=te+1;
                            }
                            break;

                        case 4:
                            if(te==0)
                            {
                                System.out.println("Queue is empty");
                            }
                            else
                            {
                                System.out.println("Number Deleted From Front End = " + arr[F]);
                                F=(F+1)%size;
                                te=te-1;
                            }
                            break;

                        case 5:
                            if(te==0)
                            {
                                System.out.println("Queue is empty");
                            }
                            else
                            {
                                x=F;
                                for(i=1; i<=te; i++)
                                {
                                    System.out.print(arr[x] + " ");
                                    x=(x+1)%size;
                                }
                                System.out.println();
                            }
                            break;

                        case 6:
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Wrong Choice");
                    }
                }
            }
        }