package bug

class Bug {

  // After,
  // 1) Building the Ensime project
  // 2) Compiling the code
  // 3) Maybe restarting Emacs
  // 4) You can uncomment the following and ensime-type-at-point

  // val x = new ThisWorks()

  // It doesn't work for the following.
  // It also doesn't tell you that no type detected at point (a worse sin)

  // val x = new \/()
}
