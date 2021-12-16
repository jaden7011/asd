package com.example.coin_gogogo.info;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PostInfo implements Parcelable{

    private String coin;
    private String title;
    private String contents;
    private String publisher;
    private Date createdAt;
    private String docid;
    private int good;
    private int comment;
    private HashMap<String, Integer> good_user;
    private ArrayList<CommentInfo> comments;
    private String DateFormate_for_layout;
    private String How_Long;
    private String password;

    public PostInfo(){}

    public PostInfo(PostInfo p) {
        //깊은 복사 전용
        this.coin = p.coin;
        this.title = p.getTitle();
        this.contents = p.getContents();
        this.publisher = p.getPublisher();
        this.createdAt = p.getCreatedAt();
        this.docid = p.getDocid();
        this.good = p.getGood();
        this.comment = p.getComment();
        this.good_user = p.getGood_user();
        this.comments = deepCopy_CommentInfo(p.getComments());
        this.DateFormate_for_layout = p.getDateFormate_for_layout();
        this.password = p.password;
    }

    public PostInfo(String publisher, String title, String contents, Date createdAt, String docid, String password,String coin) {
        //글쓰기에서 쓰임(파일미포함)
        this.coin = coin;
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
        this.createdAt = createdAt;
        this.docid = docid;
        this.good_user = new HashMap<>();
        this.comments = new ArrayList<>();
        this.good = 0;
        this.comment = 0;
        this.DateFormate_for_layout = new SimpleDateFormat("yyyy/MM/dd hh:mm", Locale.getDefault()).format(createdAt);
        this.password = password;
    }

    public PostInfo(String publisher, String title, String contents, Date createdAt, String docid, int good,
                    int comment, ArrayList<CommentInfo> comments, HashMap<String, Integer> good_user,String password,String coin) {
        //게시판 갱신/업로드용(format포함)
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
        this.createdAt = createdAt;
        this.docid = docid;
        this.good = good;
        this.comment = comment;
        this.comments = comments;
        this.good_user = good_user;
        this.DateFormate_for_layout = new SimpleDateFormat("yyyy/MM/dd hh:mm", Locale.getDefault()).format(createdAt);
        this.password = password;
        this.coin = coin;
    }

    public Map<String, Object> getPostInfo() {
        Map<String, Object> docData = new HashMap<>();
        docData.put("title", title);
        docData.put("contents", contents);
        docData.put("publisher", publisher);
        docData.put("docid", docid);
        docData.put("createdAt", createdAt);
        docData.put("good", good);
        docData.put("comment", comment);
        docData.put("good_user", good_user);
        docData.put("comments", comments);
        docData.put("password",password);
        docData.put("coin",coin);
        return docData;
    }

    public void setPostInfo(Map<String, Object> docData) {
        this.title = (String)docData.get("title");
        this.contents = (String)docData.get("contents");
        this.publisher = (String)docData.get("publisher");
        this.createdAt = (Date)docData.get("createdAt");
        this.docid =(String)docData.get("docid");
        this.good = (int)docData.get("good");
        this.comment = (int)docData.get("comment");
        this.comments = (ArrayList<CommentInfo>)docData.get("comments");
        this.good_user = (HashMap<String, Integer>)docData.get("good_user");
        this.password = (String)docData.get("password");
        this.coin = (String)docData.get("coin");
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContents() {
        return this.contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getPublisher() {
        return this.publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getDocid() {
        return docid;
    }
    public void setDocid(String docid) {
        this.docid = docid;
    }
    public int getGood() {
        return good;
    }
    public void setGood(int good) {
        this.good = good;
    }
    public int getComment() {
        return comment;
    }
    public void setComment(int comment) {
        this.comment = comment;
    }
    public HashMap<String, Integer> getGood_user() {
        return good_user;
    }
    public void setGood_user(HashMap<String, Integer> good_user) {
        this.good_user = good_user;
    }
    public ArrayList<CommentInfo> getComments() {
        return comments;
    }
    public void setComments(ArrayList<CommentInfo> comments) {
        this.comments = comments;
    }
    public String getDateFormate_for_layout() {
        return DateFormate_for_layout;
    }
    public void setDateFormate_for_layout(String dateFormate_for_layout) {
        DateFormate_for_layout = dateFormate_for_layout;
    }
    public String getHow_Long() {
        return How_Long;
    }
    public void setHow_Long(String how_Long) {
        How_Long = how_Long;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCoin() {
        return coin;
    }
    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected PostInfo(Parcel in) { // 받을 때

        coin = in.readString();
        password = in.readString();
        title = in.readString();
        contents = in.readString();
        publisher = in.readString();
        createdAt = new Date(in.readLong());
        docid = in.readString();
        good = in.readInt();
        comment = in.readInt();
        DateFormate_for_layout = in.readString();

        int size = in.readInt();
        if(size != 0) {
            good_user = new HashMap<>();
            for (int i = 0; i < size; i++) {
                good_user.put(in.readString(), in.readInt());
            }
        }else{
            good_user = new HashMap<>();
        }

        comments = in.createTypedArrayList(CommentInfo.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) { //보낼때

        dest.writeString(coin);
        dest.writeString(password);
        dest.writeString(title);
        dest.writeString(contents);
        dest.writeString(publisher);
        dest.writeLong(createdAt.getTime());
        dest.writeString(docid);
        dest.writeInt(good);
        dest.writeInt(comment);
        dest.writeString(DateFormate_for_layout);

        dest.writeInt(good_user.size());
        for(Map.Entry<String, Integer> entry : good_user.entrySet()) {
            String key = entry.getKey();
            int val = Integer.parseInt(String.valueOf(entry.getValue())); //해쉬값에 있는 int가 number형이라 에러났던건데 그거때문에 오래 삽질했음.
            dest.writeString(key);
            dest.writeInt(val);
        }

//        java.util.HashMap cannot be cast to com.example.sns_project.info.CommentInfo
//        java.util.HashMap cannot be cast to android.os.Parcelable

//        private ArrayList<CommentInfo> comments; 인데 왜 hashmap으로 읽히는지 이해가 ㅠ..
        //firestore에서 들어올 때 커스텀객체를 인식못하고 ArrayList<HashMap<String,Object>>로 읽어옴
        dest.writeTypedList(comments);

    }

    public static final Creator<PostInfo> CREATOR = new Creator<PostInfo>() {
        @Override
        public PostInfo createFromParcel(Parcel in) {
            return new PostInfo(in);
        }

        @Override
        public PostInfo[] newArray(int size) {
            return new PostInfo[size];
        }
    };


    public ArrayList<CommentInfo> deepCopy_CommentInfo(ArrayList<CommentInfo> oldone){

        ArrayList<CommentInfo> newone = new ArrayList<>();

        for(int x=0; x<oldone.size(); x++) {
            if(oldone.get(x)==null)
                continue;
            newone.add(new CommentInfo(oldone.get(x)));
        }
        return newone;
    }

}