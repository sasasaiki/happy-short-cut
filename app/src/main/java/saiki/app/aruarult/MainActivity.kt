package saiki.app.aruarult

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


//楽しいショートカット!!
















// メソッドが長くなったので分けたい
// cmd + opt + m

fun longMethod(): Int {

    val foo = 2


    //すごい処理start
    var a = foo + 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    a += 1
    //　ここまで


    return a
}

// 黄色くなったら
// alt + enter


// 同じ数字使ってるので変数に入れたい
// cmd + opt + v


// そもそもどっから呼ばれてんのこのメソッド？
// ctr + opt + H
// Shit + esc で閉じる


// どこで読まれてどこで書きこまれてる？
// opt + F7
var fooVar = 0


// ていうか全部見たい
// Command + F12



// 引数増えすぎ
// せめて改行したい

// カッコの末尾でopt + enter

data class manyArg(val hoge0: Int, val hoge1: Int, val hoge2: Int, val hoge3: Int, val hoge4: Int, val hoge5: Int, val hoge6: Int)

// 頭になんか足したい
// alt + drag



// もう一つあります

// val を選択して
// ctr + g を押すと選択と同じ文字列を選択

data class manyArg2(val hoge0: Int, val hoge1a: Int, val hoge2aa: Int, val hoge3aaa: Int, val hoge4aaa: Int, val hoge5aaaa: Int, val hoge6aaaaa: Int)

// さらに末尾にIdとか入れたい
// alt ←→ で単語単位で移動

// if の　中だけ分けたい
// alt 上下

fun nestMethod() {


    if (true) {
        val a = 1


        if (true) {

            val b = 2


            if (true) {

                val c = 3
            }
        }
    }

}


// どっかで赤くなってるけどなに？？
// F2　で飛べる




// 移動したら opt + cmd + ←→ で行き来








// ブックマーク
// F3でつけて
// cmd + F3で飛ぶ

// opt + F3でキーつけて
// cmd + F3 の後にタイプして飛ぶ
fun a() {
    b()
}

fun b() {
    c()
}

fun c() {
    longMethod()
}


fun readA() {
    val b = fooVar
}


fun writeA() {
    fooVar = 10
}

// alt + shift + 上下
// 行移動

// cmd + shit + 上下
// メソッド単位移動

// opt + shit + ctrl
// 変更したとこに移動






































// F2
やばいコード


// 最後に
// opt + cmd + l
// で綺麗にして

































// 終わりです。