import os
import re

ROOT = os.path.dirname(os.path.abspath(__file__))
TOPICS = [
    "Arrays",
    "Binary_Trees",
    "Binary_Search_Trees",
    "Graphs",
    "HashMaps",
    "Heaps",
    "Kadane_Algorithm",
    "Queues",
    "Stacks",
    "Strings",
    "Bit_Manipulation",
    "Two_Pointers"
]


def extract_metadata(filepath):
    with open(filepath, encoding="utf-8") as f:
        content = f.read()
    # Regex for metadata
    title_match = re.search(r"LeetCode Problem:\s*[\d\.]*\s*(.+)", content)
    link = re.search(r"Link:\s*(.+)", content)
    time = re.search(r"TC:\s*(.+)", content)
    space = re.search(r"SC:\s*(.+)", content)
    return {
        "title": title_match.group(1).strip() if title_match else "",
        "link": link.group(1).strip() if link else "",
        "platform": "LeetCode" if title_match else "",
        "time": time.group(1).strip() if time else "",
        "space": space.group(1).strip() if space else "",
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
    header = "| Title | Link | Platform | Time | Space |\n|---|---|---|---|---|"
    rows = []
    for p in problems:
        title = p["title"]
        link = f"[Link]({p['link']})" if p["link"] else ""
        platform = p["platform"]
        time = p["time"]
        space = p["space"]
        rows.append(f"| {title} | {link} | {platform} | {time} | {space} |")
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
