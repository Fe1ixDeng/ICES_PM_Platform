import os
def changeFileSuffix(filePath,fileName):
    newFileName = os.path.splitext(fileName)[0]+".xml"

    # 判断文件是否存在
    if (os.path.exists(os.path.join(filePath, newFileName))) :
        #存在，则删除文件
        os.remove(os.path.join(filePath, newFileName))

    os.rename( # 实现重命名操作
        os.path.join(filePath, fileName), # 文件路径不变
        os.path.join(filePath, newFileName))