========================
使い方
========================

こんな感じで起動します。

java -jar "SomenTairiku.jar" 


会社のインターネット環境がプロクシを介する場合には、以下のようにするとよいかもしれません。

java -Dhttp.proxyHost=プロクシサーバ名 -Dhttp.proxyPort=ポート番号 -Dhttp.noProxyHosts="localhost|192.*" -jar SomenTairiku.jar


初回起動時にTwitterの認証が必要ですが、特にここでは説明しません。
Have fun!

