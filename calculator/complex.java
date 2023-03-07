package calculator;


public class complex {
    public int r,im ;
    public complex(int r,int im){
        this.r = r;
        this.im = im;
    }
    public complex add(complex b){
        return new complex(this.r+b.r,this.im+b.im);
    } 
    @Override
    public String toString(){
        return this.r+"+"+this.im+"i";
    }   
}

