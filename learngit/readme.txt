git 创建本地项目并上传到github （新项目上传到github）
首先你需要一个github账号，所有还没有的话先去注册吧！

https://github.com/

我们使用git需要先安装git工具，这里给出下载地址，下载后一路直接安装即可：

https://git-for-windows.github.io/

1.进入Github首页，点击New repository新建一个项目

 2.填写相应信息后点击create即可

Repository name: 仓库名称

Description(可选): 仓库描述介绍

Public, Private : 仓库权限（公开共享，私有或指定合作者）

Initialize this repository with a README: 添加一个README.md

gitignore: 不需要进行版本管理的仓库类型，对应生成文件.gitignore

license: 证书类型，对应生成文件LICENSE



4.点击Clone or dowload会出现一个地址，copy这个地址备用。

5.接下来就到本地操作了，首先右键你的项目，如果你之前安装git成功的话，右键会出现两个新选项，分别为Git Gui Here,Git Bash Here,这里我们选择Git Bash Here，进入如下界面，Test_Bluetooth即为我的项目名。

6.接下来输入如下代码（关键步骤），把github上面的仓库克隆到本地

git clone https://github.com/CKTim/BlueTooth.git（https://github.com/CKTim/BlueTooth.git替换成你之前复制的地址）

 7.这个步骤以后你的本地项目文件夹下面就会多出个文件夹，该文件夹名即为你github上面的项目名，如图我多出了个Test文件夹，我们把本地项目文件夹下的所有文件（除了新多出的那个文件夹不用），其余都复制到那个新多出的文件夹下，

8.接着继续输入命令 cd Test，进入Test文件夹

9.接下来依次输入以下代码即可完成其他剩余操作：

git add .        （注：别忘记后面的.，此操作是把Test文件夹下面的文件都添加进来）

git commit  -m  "提交信息"  （注：“提交信息”里面换成你需要，如“first commit”）

git push -u origin master   （注：此操作目的是把本地仓库push到github上面，此步骤需要你输入帐号和密码）

---------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------

第一步：在提交项目之前必须先对项目进行更新，此项特别重要，如果不进行更新，别人有项目提交到服务器上，
那么你的项目将会提交不上去，使用git解决冲突会比较麻烦，即使你解决了冲突，
但是有时候不注意会冲掉别人写的代码，不像svn使用那么简单，所以提交自己项目前必须进行更新（特别重要）

或者对自己要提交的文件可以先进行比较一下远程库的最新版本，看看有没有冲突，在决定要不要提交 或者解决冲突再提交
右键 Git --> compare with branch  选择远程库的分支进行比较 更新
Git --> compare with 可以选择与自己提交的版本进行比较  与之前提交的版本对比 看差异
Git -->compare with the same repository version 与自己本身这个版本比较 看看自己改了什么

1：选择pull进行更新代码操作；选中项目 右键--->repository -->pull

2、对github上的文件更改上传 如下命令

    git add readme.txt
    git commit -m "上传readme.txt"  //提交到本地库
    git push -u origin master // 本地库提交到github远程库

    对应idea 就是
    选中readme.txt 右击 Git -->commit File //添加到本地库
    Git -->repository(最后一项) ---> push   //本地库上传到远程github库


3、github上传 新增文件

git add src/main/java/com/example/demo/entity/Man.java  // 提交到缓存中
git commit -m "add Man class" //提交到本地库
git push -u origin master  //提交到远程库

idea 操作
右键 Git ---> Add  // 提交到缓存中
右键 Git ---> commit File  -->跳转到commit页面 点击commit （执行commit and push）  //提交到本地库
右键Git ---> repository -->push  //提交到远程库

pull request
https://www.cnblogs.com/zhangjianbin/p/7774073.html


4、新建分支
   4.1 首先，我们创建dev分支，然后切换到dev分支
       $ git checkout -b dev
       Switched to a new branch 'dev'
        git checkout命令加上-b参数表示创建并切换，相当于以下两条命令：

        $ git branch dev
        $ git checkout dev
        Switched to branch 'dev'

        然后，用git branch命令查看当前分支：

        $ git branch
        * dev
          master
        git branch命令会列出所有分支，当前分支前面会标一个*号。

     4.2  然后在dev分支上修改learngit/readme.txt ,并提交
           git add learngit/readme.txt
           git commit -m "branch dev commit leanrngit/readme.txt"
           git push -u origin dev   //提交到远程dev库  此时master分支还看不到

      4.3 现在，dev分支的工作完成，我们就可以切换回master分支：

          $ git checkout master
          Switched to branch 'master'

          切换回master分支后，再查看一个readme.txt文件，刚才添加的内容不见了！因为那个提交是在dev分支上，而master分支此刻的提交点并没有变：

          现在，我们把dev分支的工作成果合并到master分支上：

          $ git merge dev
          Updating d17efd8..fec145a
          Fast-forward
           readme.txt |    1 +
           1 file changed, 1 insertion(+)

          git merge命令用于合并指定分支到当前分支。合并后，再查看readme.txt的内容，就可以看到，和dev分支的最新提交是完全一样的。

          注意到上面的Fast-forward信息，Git告诉我们，这次合并是“快进模式”，也就是直接把master指向dev的当前提交，所以合并速度非常快。

          当然，也不是每次合并都能Fast-forward，我们后面会讲其他方式的合并。

          合并完成后，就可以放心地删除dev分支了：







