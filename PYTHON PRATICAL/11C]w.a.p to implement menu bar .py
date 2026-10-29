from tkinter import *
root = Tk()
root.geometry("300x200")
mb=Menubutton(root,text="option",relief=RAISED)
mb.pack()
mb.menu=Menu(mb,tearoff=0)
mb["menu"]=mb.menu
a=IntVar()
b=IntVar()
c=IntVar()
d=IntVar()
mb.menu.add_checkbutton(label="option Quit!",variable=a,command=root.destroy)
mb.menu.add_checkbutton(label="option EXIT!",variable=b,command=root.destroy)
mb.menu.add_checkbutton(label="option END!",variable=c,command=root.destroy)
mb.menu.add_checkbutton(label="option END!",variable=d,command=root.destroy)
mb.pack()
root.mainloop()

