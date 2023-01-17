import java.util.ArrayList;

public class UAS1D {
    String MessageID;
    String MessageName;
    ArrayList<String> a;
    private ArrayList<String> context;

    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public String getMessageName() {
        return MessageName;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }


    public void setContext(ArrayList<String> context) {
        this.context = context;
    }

    public ArrayList<String> getContext() {
        return context;
    }
    public UAS1D() {

    }

    public String FindWords(ArrayList<String> context, String cari) {
//        context.contains(cari);
//        context.indexOf(context.contains(cari));
        return  "Kata : "+cari+"("+context.contains(cari)+")"+" , Ada Pada Indeks Ke - "+context.indexOf(cari);
    }
}
