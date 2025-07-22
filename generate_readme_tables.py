import os
import re

ROOT = os.path.dirname(os.path.abspath(__file__))
TOPICS = [
    "Arrays",
    "Binary_Tree",
    "Binary_Search_Tree",
    "Graphs",
    "HashMap",
    "Heaps",
    "Kadane_Algorithm",
    "Queues",
    "Stack",
    "Strings",
    "Bit_Manipulation",
    "Two_Pointers"
]


def extract_metadata(filepath):
    with open(filepath, encoding="utf-8") as f:
        content = f.read()
    # LeetCode format
    lc_match = re.search(r"LeetCode Problem:\s*([\d\.]+)\s*(.+)", content)
    # GfG format: // GfG: Print Adjacency List
    gfg_match = re.search(r"GfG:\s*([^\n]+)", content)
    # NeetCode format: NeetCode: Two Sum
    neetcode_match = re.search(r"NeetCode:\s*([^\n]+)", content)
    # Code360 format: Code360: Merge K Sorted Arrays
    code360_match = re.search(r"Code360:\s*([^\n]+)", content)

    link = re.search(r"Link:\s*(.+)", content)
    time = re.search(r"TC:\s*(.+)", content)
    space = re.search(r"SC:\s*(.+)", content)

    if lc_match:
        return {
            "question_number": lc_match.group(1).strip(),
            "title": lc_match.group(2).strip(),
            "link": link.group(1).strip() if link else "",
            "platform": "LeetCode",
            "time": time.group(1).strip() if time else "",
            "space": space.group(1).strip() if space else "",
            "file": os.path.basename(filepath)
        }
    elif gfg_match:
        return {
            "question_number": "-",
            "title": gfg_match.group(1).strip(),
            "link": link.group(1).strip() if link else "",
            "platform": "GfG",
            "time": time.group(1).strip() if time else "",
            "space": space.group(1).strip() if space else "",
            "file": os.path.basename(filepath)
        }
    elif neetcode_match:
        return {
            "question_number": "-",
            "title": neetcode_match.group(1).strip(),
            "link": link.group(1).strip() if link else "",
            "platform": "NeetCode",
            "time": time.group(1).strip() if time else "",
            "space": space.group(1).strip() if space else "",
            "file": os.path.basename(filepath)
        }
    elif code360_match:
        return {
            "question_number": "-",
            "title": code360_match.group(1).strip(),
            "link": link.group(1).strip() if link else "",
            "platform": "Code360",
            "time": time.group(1).strip() if time else "",
            "space": space.group(1).strip() if space else "",
            "file": os.path.basename(filepath)
        }
    else:
        return {
            "question_number": "",
            "title": "",
            "link": "",
            "platform": "",
            "time": "",
            "space": "",
            "file": os.path.basename(filepath)
        }


def scan_topic(topic):
    topic_dir = os.path.join(ROOT, topic)
    if not os.path.isdir(topic_dir):
        return []
    problems = []
    for fname in os.listdir(topic_dir):
        if fname.endswith(('.java', '.cpp')):
            meta = extract_metadata(os.path.join(topic_dir, fname))
            if meta["title"]:
                problems.append(meta)
    return problems


def make_table(problems):
    if not problems:
        return "_No problems yet._"
    header = "| S.No | QuestionNumber | Title | Link | Platform | Time | Space |\n|---|---|---|---|---|---|---|"
    rows = []
    for idx, p in enumerate(problems, 1):
        qnum = p["question_number"]
        title = p["title"]
        link = f"[Link]({p['link']})" if p["link"] else ""
        platform = p["platform"]
        time = p["time"]
        space = p["space"]
        rows.append(
            f"| {idx} | {qnum} | {title} | {link} | {platform} | {time} | {space} |")
    return header + "\n" + "\n".join(rows)


def main():
    output = []
    output.append("## 📁 Repository Structure\n")
    output.append(
        "Below, click on any topic to view the list of solved problems with details.\n")
    for topic in TOPICS:
        problems = scan_topic(topic)
        output.append(
            f"<details>\n<summary><strong>{topic}</strong></summary>\n")
        output.append(make_table(problems))
        output.append("\n</details>\n")
    with open("README_TABLES.md", "w", encoding="utf-8") as f:
        f.write("\n".join(output))
    print("README_TABLES.md generated. Copy its content into your README.md.")


if __name__ == "__main__":
    main()
