# 🤖 AI-Powered Java Code Reviewer with Gemini

This project was developed as part of the **Google & Kaggle GenAI Intensive Capstone (Q1 2025)**. It explores how generative AI—specifically Google's Gemini—can be used to automate code reviews for Java applications.

## 🚀 What It Does

- Uploads Java `.java` files from a repo
- Sends files to Gemini via `client.files.upload(...)` (document understanding)
- Applies zero-shot and few-shot prompts to get review feedback
- Generates:
  - bullet-point feedback by category
  - a summary of key issues
  - a numeric review score (1–10)
- Uses Gemini's native **JSON output mode** for structured, machine-readable output
- Stores results in a DataFrame and exports to `.json`

## 💡 Key Features

- ✅ Prompt engineering (zero-shot + few-shot)
- ✅ Gemini document understanding via file uploads
- ✅ JSON output via `response_mime_type="application/json"`
- ✅ Summarization and self-evaluation
- ✅ Output export for downstream tools

## 📂 Project Structure

```
├── google-capstone-java-ai-reviewer.ipynb   # Main notebook
├── CodeReviewEngineer/                      # Cloned Java source files
├── outputs/
│   ├── reviews.json                         # Exported review results
│   └── summaries.csv                        # (Optional) summary exports
```

## 🔧 Requirements

- Google Gemini API key (add via Kaggle secrets or env)
- `google-generativeai`
- Kaggle Notebook or local Jupyter environment

## 🧠 Example: JSON Output (from Gemini)

```json
{
  "issues": [
    {"line": 12, "message": "Avoid raw types"},
    {"line": 18, "message": "Catch specific exceptions"}
  ],
  "summary": "Improve type safety and exception handling.",
  "score": 7
}
```

## 📈 Why This Matters

Manual code review is time-consuming, inconsistent, and error-prone. By using generative AI to automate this process, developers can save time, get consistent feedback, and focus on deeper design work.

## 🔗 Links

- 📖 [Blogpost](https://mrbasm.github.io/2024/04/12/gen-ai-capstone.html)
- 📘 [Capstone Challenge on Kaggle](https://www.kaggle.com/competitions/gen-ai-intensive-course-capstone-2025q1)

---

Let's build what’s next — together.
