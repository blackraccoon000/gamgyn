## Spring Boot 練習用リポジトリ

- SpringBoot
- thymeleaf

## 開発環境セットアップ

1. リポジトリをクローンします。

   ```bash
   git clone git@github.com:your-repo-name/gamygyn.git
   cd gamygyn
   ```

## SSHキーの設定方法

開発コンテナ内でGit操作を行う場合、SSHキーを設定する必要があります。

1. 開発コンテナ内でSSHキーを生成していない場合は、以下のコマンドで生成します。

    ```bash
    ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
    ```

## 開発コンテナの再ビルド

開発コンテナの設定を変更した場合、コンテナを再ビルドする必要があります。

1. VSCodeのコマンドパレット（`Ctrl+Shift+P`）を開き、`Remote-Containers: Rebuild and Reopen in Container`を選択します。

2. 再ビルド後、必要に応じて以下の設定を再実行してください。
   - SSHキーの設定
   - 環境変数の設定

## Java Version

    ```bash
    vscode ➜ /workspaces/gamygyn (main) $ java --version
    openjdk 21.0.6 2025-01-21 LTS
    OpenJDK Runtime Environment Microsoft-10800202 (build 21.0.6+7-LTS)
    OpenJDK 64-Bit Server VM Microsoft-10800202 (build 21.0.6+7-LTS, mixed mode, sharing)
    vscode ➜ /workspaces/gamygyn (main) $
    ```

## ビルドツール gradle

- 拡張機能のgradleから発火もできる。
- hotReloadはbootRunと併用する必要がある。

```
ビルドコマンド
 gradle build

監視＋ビルド
 gradle build --continuous

起動
 gradle bootRun
```

## トラブルシューティング

### 開発コンテナが起動しない

- Dockerが起動していることを確認してください。
- VSCodeの「Remote - Containers」拡張機能がインストールされていることを確認してください。
- Dockerのimageを確認してください。

### Git操作で`Permission denied (publickey)`エラーが発生する

- SSHキーが正しく設定されているか確認してください。
- ホストマシンのSSHエージェントが共有されているか確認してください。
- ただし、

### 依存関係が正しくインストールされない
- 開発コンテナを再ビルドしてください。
   ```bash
   Ctrl+Shift+P -> Remote-Containers: Rebuild and Reopen in Container

### vscode上でgradleがうまく機能しない

- javaのインストール場所が、vscodeのインストール場所と異なる場合があり、修正する必要があるケースがあります。