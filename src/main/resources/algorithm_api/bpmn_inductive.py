import sys
import pm4py
from tools import changeFileSuffix
# 读取日志文件地址
uploadFilePath = sys.argv[1]
uploadFileName = sys.argv[2]
pythonSavePath = sys.argv[3]
# 读取xes文件
event_log = pm4py.read_xes(file_path=uploadFilePath+uploadFileName)
# 生成流程树
process_tree = pm4py.discover_process_tree_inductive(event_log)
# 生成bpmn模型
bpmn_model = pm4py.convert_to_bpmn(process_tree)
# 保存bpmn模型
pm4py.write_bpmn(bpmn_model,pythonSavePath+"expt_im_output")
# 修改后缀（.bpmn）为.xml
changeFileSuffix(pythonSavePath,"expt_im_output"+".bpmn")
# 输出成功
print("Python return: " + "success!")
