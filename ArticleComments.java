package com.DefaultConstructors;

class Article{
    String Author;
    String title;
    String content;
    String comments;
    String status;
}

class Comments{
    String commenterName;
    String commentcontent;
    int likescount;
    int repliescount;
    int userid;

}

public class ArticleComments {
    public static void main(String[] args) {
        Article suma=new Article();
        suma.Author="Jordan";
        suma.title="Introduction To Java";
        suma.content="Java is a popular programing language";
        suma.comments="Great Article";
        suma.status="Published";
        System.out.println("Author :" +suma.Author);
        System.out.println("Title :" +suma.title);
        System.out.println("Content :" +suma.content);
        System.out.println("Comments :" +suma.comments);
        System.out.println("Status :" +suma.status);
        System.out.println("+++++++++++++++");



        Comments appu=new Comments();
        appu.commenterName="Sudeep";
        appu.commentcontent="Your Article is Super";
        appu.likescount=25;
        appu.repliescount=14;
        appu.userid=19;
        System.out.println("Commenter Name :"+appu.commenterName);
        System.out.println("Comment Content :" +appu.commentcontent);
        System.out.println("likes Count :"+appu.likescount);
        System.out.println("Replies Count :"+appu.repliescount);
        System.out.println("User ID :"+appu.userid);
    }
}
