package pages;

public class AllPages {
/*
20230201 ilk yorum **************
***************+*******
*************
 */
    /*
20230201 ikinci yorum **************
***************+*******
*************
 */
private GoogleHome googleHome;
private GoogleResult googleResult;

    public GoogleHome googleHome(){
        if (googleHome == null){
            googleHome = new GoogleHome();
        }
        return googleHome;
    }

    public GoogleResult googleResult(){
        if (googleResult == null){
            googleResult = new GoogleResult();
        }
        return googleResult;
    }
}
