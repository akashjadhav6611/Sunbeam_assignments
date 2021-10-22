

class Box
{
    private double lenght,width,height;
    private String color;
    Box(double lenght,double width,double height,String color)
    {
        this.lenght=lenght;
        this.width=width;
        this.height=height;
        this.color=color;
    }
    Box(double side,String color)
    {
        this.lenght=side;
        this.width=side;
        this.height=side;
        this.color=color;
    }
    String getDimensions()
    {
        return "Dimension:"+"Length: "+this.lenght +" Width: "+this.width+" Height: "+this.height +" Color: "+this.color;
    }

    double getVolume()
    {
        return this.lenght*this.height*this.width;
    }

    boolean isEqual(Box b)
    {
        if((this.lenght==b.lenght)&&(this.height==b.height)&&(this.width==b.width))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    String getColor()
    {
        return this.color;
    }
    Box createNewBox(double lenght,double width,double height)
    {
        Box b =new Box(0,0,0,null);
        b.color=this.color;
        b.lenght=this.lenght+lenght;
        b.width=this.width+width;
        b.height=this.height+height;


        return b;


    }
}