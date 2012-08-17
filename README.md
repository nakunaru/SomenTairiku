# README

## これは何？
@25Re さんの「ラーメン大陸」のパクリソフトである「そーめん大陸」を  
@kaibadashがフォークして欲しい機能を追加した「薬味付きそーめん大陸」  
（https://github.com/kaibadash/SomenTairiku）  
をさらにフォークして、見た目を仕事してるっぽくしたものです。  
  
![screenshot](https://github.com/nakunaru/SomenTairiku/blob/vim_like/screenshot.png?raw=true)  

  
本家そーめん大陸はこちら。  
http://d.hatena.ne.jp/yayugu/20100516/1273972853  
https://github.com/yayugu/SomenTairiku  
  
  
■ダウンロード  
https://github.com/nakunaru/SomenTairiku/downloads  
  
■使い方：  
* Ctrl + Enter で投稿  
* 右下の数字を左クリックでWindowの枠の表示/非表示切り替え
* 右下の数字を右クリックで認証画面
* 画像をD&Dでついっぷるに投稿
* 転んでも泣かない
* 後ろの上司に気をつけろ！
  
  
## 使い方
こんな感じで起動します。  

`java -jar "SomenTairiku.jar"` 


会社のインターネット環境がプロクシを介する場合には、以下のようにするとよいかもしれません。

`java -Dhttp.proxyHost=プロクシサーバ名 -Dhttp.proxyPort=ポート番号 -Dhttp.noProxyHosts="localhost|192.*" -jar SomenTairiku.jar`


初回起動時にTwitterの認証が必要ですが、特にここでは説明しません。  
Have fun!  


## ライセンス
GPLv3


