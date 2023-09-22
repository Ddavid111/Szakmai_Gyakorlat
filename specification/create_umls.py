"""
Create UML diagrams for embedded PlantUML source codes.
It creates the figures in EPS file format at the required path
extracted from the \includegraphics command.
"""

import os
import re

PATH_PATTERN = r'.*\{(?P<path>.*)\}.*'

with open('zv_app_spec.tex') as tex_file:
    is_uml_line = False
    wait_graphics_path = False
    uml_code = ''
    # line_num = 1
    for line in tex_file:
        if line.strip().startswith('@startuml'):
            is_uml_line = True
        if is_uml_line:
            uml_code += line
        if line.strip().startswith('@enduml'):
            # print(uml_code)
            is_uml_line = False
            wait_graphics_path = True
        if wait_graphics_path:
            if line.strip().startswith(r'\includegraphics'):
                graphics_path = re.search(PATH_PATTERN, line)['path']
                print(f'Create {graphics_path}.eps ...')
                uml_code_path = f'{graphics_path}.txt'
                with open(uml_code_path, 'w') as uml_code_file:
                    uml_code_file.write(uml_code)
                os.system(f'plantuml {uml_code_path} -teps {graphics_path}.eps')
                os.remove(uml_code_path)
                wait_graphics_path = False
                uml_code = ''
        # line_num += 1
print('[DONE]')
