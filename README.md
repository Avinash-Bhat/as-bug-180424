Introduction
===

This repository contains the details on how to regenerate the android-studio bug [#180424](http://b.android.com/180424).

Steps to replicate the bug
---
1. create the directory structures *debug/java* and *main/java* under *[app/src](https://github.com/Avinash-Bhat/as-bug-180424/tree/master/app/src)* directory

   now the directories should look like this

   ```
   <root>
   |...
   |--app
      |...
      |-- src
          |...
          |--debug
             |--java
          |--main
             |--java
          |--release
             |--java
      |...

   ```
2. create the class `bugs.as.linkedresourcesbug.StringProvider` in the *release* folder. make a link of the same in the *debug* folder.

   Now if you check, `StringProvider.java` should be listed under the folder *debug/bugs/as/linkedresourcesbug*
   Open both the files in the editor, and edit one (say one in *debug* variant), the other will not be updated until the file is synchronized.