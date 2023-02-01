package pages;

public class AllPages {

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
