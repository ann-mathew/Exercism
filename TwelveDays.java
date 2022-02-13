class TwelveDays{
    String verse(int verseNumber){
        String day[]= {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth","eleventh", "twelfth"};
        String gifts="";
        switch(verseNumber){
                case 12:
                    gifts+="twelve Drummers Drumming, ";
                case 11:
                    gifts+="eleven Pipers Piping, ";
                case 10:
                    gifts+="ten Lords-a-Leaping, ";
                case 9:
                    gifts+="nine Ladies Dancing, ";
                case 8:
                    gifts+="eight Maids-a-Milking, ";
                case 7:
                    gifts+="seven Swans-a-Swimming, ";
                case 6:
                    gifts+="six Geese-a-Laying, ";
                case 5:
                    gifts+="five Gold Rings, ";
                case 4:
                    gifts+="four Calling Birds, ";
                case 3:
                    gifts+="three French Hens, ";
                case 2:
                    gifts+="two Turtle Doves, and ";
                case 1:
                    gifts+="a Partridge in a Pear Tree.";                         
        }
        String s="On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: "+gifts+"\n";
        return s;
    }

    String verses(int startVerse, int endVerse){
        String s="";
        for(int i=startVerse;i<=endVerse;i++){
                s+=verse(i);
                if (i!=endVerse)
                    s+="\n";
        }
        return s;
    }
        
    
    String sing(){
        return verses(1,12);
    }
}