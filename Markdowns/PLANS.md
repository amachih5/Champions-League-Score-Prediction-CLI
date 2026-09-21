# やること

※大まかなコードの配置です。

## main/Main.java

- 実行部分。

```java
package main;
import java.util.Scanner;
//MenuConst.javaにバトンをわたす
//CRUD専用の.javaにバトンをわたす

public class Main{
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.printIn("名前を入力してください。: ");
    String name = scan.next();

    System.out.printIn("====================");
    System.out.printIn("Hello," + name + "! Let's Predict Match's Score!");
    System.out.printIn("====================");
  
    //MenuConst.Javaのクラス名を書く

    Scanner scan = new Scanner(System.in);
    System.out.printIn("Please Choose number What You want. : ");
    int chooseNumber = scan.nextInt();

    //条件分岐or判定に(switch)
    switch (ChooseNumber) {
      case 0;
      //終わる
       System.out.printIn("Exit");
       break;
      case 1;
        //登録画面へ
      case 2;
        //一覧画面へ
      case 3;
        //更新画面へ
      case 4;
        //削除画面へ
      case 5;
        //判定画面へ
      default:
        System.out.printIn("数字で入力してください。");
    }
    scan.close();
  }
}
```

## model/Match.java

- 記録するものを保存する変数を作る
- 他方からアクセスできなくするため、private修飾子を使う

```java
package model;
public class Match {
  private int id; //登録した番号
  private String homeTeam;//ホームチーム
  private String awayTeam;//アウェイチーム
  private int predHome; //(予想)ホームチームスコア
  private int predAway;//(予想)アウェイチームスコア
  private Integer realHome; //(現実)ホームチームスコア
  private Integer realAway; //(現実)アウェイチームスコア
}
```

## constant/MenuConst.java

メニュー表示を担当。

```java
package constant;
import java.util.Scanner;
//InputUtil.javaにバトンをわたす

public class MenuConst {
  public void showMenu() {
    System.out.printIn("Menu↓");
    System.out.printIn("");
    System.out.printIn("==================");
    System.out.printIn("1.Register/2.List/3.Update/4.Delete/5.Judge/0.End");
    System.out.printIn("==================");
  }
  //InputUtil.javaにバトンをわたす(クラス名を書く)
}
```

## util/InputUtil.java

- 入力する番号をチェックをする係。

```java
package util;
//MenuConstからバトンを受け取った！
import java.util.Scanner;
//CRUD専用のJavaファイルにバトンをわたす
//判定用Javaファイルにバトンをわたす

public class InputUtil {
  public void selectNumberCheck(int number) {
     //選んだ番号が合っているか範囲外かチェックする。
  }
}
```

## service/MatchService.java

- CRUD担当。

```java
package service;
import java.util.Scanner;
import java.util.ArrayList;
//Model/Match.javaをインポート
//エラーのパッケージをインポート
public void MatchService {
  ArrayList<Match> details = new ArrayList<Match>();

  public void registerMatchDetails() {
    try {
    //Registering
    //addメソッドを使う
    } catch (e) {
      System.out.printIn("Error. Cause: " + e);
    }
  }

  public void readMatches() {
    //Reading:
  }

  public void updateMatches() {
    //Updating:
  }
  
  //削除は特に危険なので、保険をかける
  public void deleteMatches() {
    try {
    //Write Deleting Code Here
    //print
    } catch(e) {
      System.out.printIn("");
    }
  }
}
```

## judge/Judging.java

- 自分の予想スコアと実際の結果のスコアを判定する係。
  - 的中: +3, ハズレ-3にする。
  - 独自ルール: 
    1回目: ハズレ 0
    2回目: ハズレ 0
    マイナスにならないよう調整する

```java
package judge;
//メインインポート
//Matchをインポート
//判定なので、条件分岐が中心
public void judge() {
  if () {
　　// 実際のスコアと予想したスコアが同じだったら+3ポイント
  } else {
    //違ってたら0ポイント
  }
}

//外れまくってもマイナスになれないようにするやつ
public void notMinusPoint() {
  if () {
    //負け続けてマイナスになりそうだったら初期値に戻す。
  } else {
    //それ以外だったらそのまま続ける。
    //↑PythonでいうWhile Trueを使った方がいいかもしれない...
  }
}
```
