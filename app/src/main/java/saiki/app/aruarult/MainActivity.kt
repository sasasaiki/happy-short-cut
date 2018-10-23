package saiki.app.aruarult

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


//リファクタあるある始まるよ!!
















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
// ctr + g

data class manyArg2(val hoge0: Int, val hoge1a: Int, val hoge2aa: Int, val hoge3aaa: Int, val hoge4aaa: Int, val hoge5aaaa: Int, val hoge6aaaaa: Int)

// さらに末尾にIdとか入れたい
// alt ←→

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





// 移動したら opt + cmd + ←→ で行き来








// 名前変更したい
// shit + F6
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








































// F2
やばいコード


// 最後に
// opt + cmd + l
// で綺麗にして

































// 終わりです。