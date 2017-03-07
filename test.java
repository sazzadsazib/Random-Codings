class test {
    int Xmin= -250; 
    int Xmax= 250;
    int  Ymin= -200;
    int Ymax= 200;
void cyrusBeakAlgo(int x0,int y0,int x1,int y1) {
     double a1=0.0,b1=0.0,a2=0.0,b2=0.0;
     System.out.println("OLD :");
        System.out.println("x0 :"+x0);
        System.out.println("y0 :"+y0);
        System.out.println("x1 :"+x1);
        System.out.println("y1 :"+y1);
        
    int dx=x1-x0;
        int dy=y1-y0;
        //printf("%d\n",dx);
        //printf("%d\n",dy);
        
//    int output=0,output1=0;
        double tEmax=0;
        double tLmin=1;
        double D[]=new double[4];
        double W[]=new double[4];
        
        for(int i=0; i<4; i++) {
            if(i==0) {
                //350,-250,-400,300
                W[i]=y1-y0;
                D[i]=y0-Ymax;
                //printf("%d\n",D[i]);
               // printf("%d\n",W[i]);
                
            }else if(i==1) {
                W[i]=-(dy);
                D[i]=-(y0-Ymin);
                //    printf("%d\n",D[i]);
            }else if(i==2) {
                W[i]=dx;
                D[i]=x0-Xmax;
                //printf("%d\n",D[i]);
            }else if(i==3) {
                W[i]=-dx;
                D[i]=-(x0-Xmin);
                //    printf("%d\n",D[i]);
            }
            
            double tL=99999999.0;
            double tE=0.0;
            if(W[i]>0) {
                tL=-(D[i]/W[i]);
                
            }else {
                tE=-(D[i]/W[i]);
            }
            if(tE>tEmax) {
                tEmax=tE;
            }
            if(tL<tLmin) {
                tLmin=tL;
                
            }
            
            
            
        }
        
        
        
        if( !((tEmax <0 || tEmax>1) && (tLmin>0 || tLmin<1)) && !(tEmax>tLmin) ) {
            //printf("%f",tEmax);
            //printf("%f",tLmin);
            
//double a1,b1,a2,b2=0.0;
    a1=x0+((x1-x0)*tEmax);
    a2=x0+((x1-x0)*tLmin);
    b1=y0+((y1-y0)*tEmax);
    b2=y0+((y1-y0)*tLmin);
        
        }
         System.out.println("NEW :");
        System.out.println("x0 :"+a1);
        System.out.println("y0 :"+b1);
        System.out.println("x1 :"+a2);
        System.out.println("y1 :"+b2);
        
        
    }
    public static void main(String[] args) {
        test t=new test();
            t.cyrusBeakAlgo(350,-250,-400,300);
        //t.cyrusBeakAlgo(-400,300,350,-250);
        
        
    }
}


