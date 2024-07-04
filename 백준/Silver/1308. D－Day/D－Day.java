import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = sc.nextLine();
        String dday = sc.nextLine();
        String[] todays = today.split(" ");
        String[] ddays = dday.split(" ");
        int yd,md,dd,youn=0,pd = 0;

        if((Integer.parseInt(ddays[0]) - Integer.parseInt(todays[0]))==1000 && Integer.parseInt(ddays[1])>=Integer.parseInt(todays[1]) && Integer.parseInt(ddays[2])>=Integer.parseInt(todays[2])){
            System.out.println("gg");
        }else if(Integer.parseInt(ddays[0]) - Integer.parseInt(todays[0])>1000){
            System.out.println("gg");
        }
        else{
            yd = Integer.parseInt(ddays[0])-Integer.parseInt(todays[0])-1;
            if(yd == -1){yd++;}
            yd = yd * 365;
            for(int i = Integer.parseInt(todays[0])+1; i<=Integer.parseInt(ddays[0])-1; i++){
                if(i%4 == 0){
                    if(i%100 == 0){
                        if(i%400 == 0){
                            youn++;
                        }
                    }else{
                        youn++;
                    }
                }
            }
            yd = yd + youn;

            md = (12 - Integer.parseInt(todays[1])) * 30;
            md = md + (Integer.parseInt(ddays[1])-1) * 30;

            if(Integer.parseInt(todays[1]) != 12){
                for(int i = Integer.parseInt(todays[1])+1; i<=12; i++){
                    if(i==2){
                        pd=pd-2;
                        if(Integer.parseInt(todays[0])%4 == 0){
                            if(Integer.parseInt(todays[0])%100 == 0){
                                if(Integer.parseInt(todays[0])%400 == 0){
                                    pd++;
                                }
                            }else{
                                pd++;
                            }
                        }
                    }
                    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                        pd++;
                    }

                }
            }
            if(Integer.parseInt(ddays[1])!=1){
                for(int i = 1; i<Integer.parseInt(ddays[1]); i++){
                    if(i==2){
                        pd=pd-2;
                        if(Integer.parseInt(ddays[0])%4 == 0){
                            if(Integer.parseInt(ddays[0])%100 == 0){
                                if(Integer.parseInt(ddays[0])%400 == 0){
                                    pd++;
                                }
                            }else{
                                pd++;
                            }
                        }
                    }
                    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                        pd++;
                    }

                }
            }
            md = md + pd;
            if(Integer.parseInt(ddays[0])==Integer.parseInt(todays[0])){
                md = 0;
                for(int i=Integer.parseInt(todays[1])+1; i<=Integer.parseInt(ddays[1])-1; i++){
                    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                        md = md+31;
                    }else if(i==2){
                        md = md+28;
                        if(Integer.parseInt(todays[0])%4 == 0){
                            if(Integer.parseInt(todays[0])%100 == 0){
                                if(Integer.parseInt(todays[0])%400 == 0){
                                    md++;
                                }
                            }else{
                                md++;
                            }
                        }
                    }else{
                        md = md+30;
                    }
                }
            }

            if(Integer.parseInt(ddays[0])==Integer.parseInt(todays[0]) && Integer.parseInt(ddays[1])==Integer.parseInt(todays[1])){
                dd = Integer.parseInt(ddays[2])-Integer.parseInt(todays[2]);
            }
            else{
                int a = Integer.parseInt(todays[1]);
                if(Integer.parseInt(todays[1])==2){
                    if(Integer.parseInt(todays[0])%4 == 0){
                        if(Integer.parseInt(todays[0])%100 == 0){
                            if(Integer.parseInt(todays[0])%400 == 0){
                                dd = 29-Integer.parseInt(todays[2]);
                            }else{
                                dd = 28-Integer.parseInt(todays[2]);
                            }
                        }else{
                            dd = 29-Integer.parseInt(todays[2]);
                        }
                    }else{
                        dd = 28-Integer.parseInt(todays[2]);
                    }
                }else{
                    if(a==4||a==6||a==9||a==11){
                        dd = 30-Integer.parseInt(todays[2]);
                    }else{
                        dd = 31-Integer.parseInt(todays[2]);
                    }
                }
                dd = dd + Integer.parseInt(ddays[2]);
            }
            System.out.println("D-"+(yd+md+dd));
        }

    }
}