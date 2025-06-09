# 🚀 Git & GitHub Instructions for IntelliJ IDEA (Beginner Friendly)

These instructions will help you set up Git and GitHub and use IntelliJ IDEA to commit and push your Kotlin exercises.

---

## 📦 Step 1: Install Git

1. Go to [https://git-scm.com/downloads](https://git-scm.com/downloads).
2. Download and install Git for your operating system.
3. Verify installation:
   ```bash
   git --version
   ```
   You should see something like `git version 2.x.x`.

---

## 🌐 Step 2: Create a GitHub Account

1. Go to [https://github.com](https://github.com).
2. Sign up for a free account.
3. Verify your email address.

---

## 🛠️ Step 3: Configure Git (One Time Only)

Run the following in your terminal or Git Bash:

```bash
git config --global user.name "Your Full Name"
git config --global user.email "your@email.com"
```

---

## 🧠 Step 4: Clone a Repository (or Create a New One)

### Option 1: Clone an Existing Repo

1. Instructor provides a GitHub URL.
2. In IntelliJ IDEA:
   - Click **Get from Version Control** or `File > New > Project from Version Control`.
   - Paste the repository URL.
   - Choose a local folder → Click **Clone**.

### Option 2: Create Your Own Repository

1. On GitHub, click `+` → **New repository**.
2. Name it, e.g., `kotlin-backend-exercises`.
3. Click **Create repository** and copy the URL.
4. Use **Get from Version Control** in IDEA to clone it.

---

## ✍️ Step 5: Work on Your Exercise

- Add or modify your Kotlin code in the project.
- Make sure your project builds and runs correctly.

---

## 💾 Step 6: Commit Changes

In IntelliJ IDEA:

1. Press `Ctrl + K` (Windows/Linux) or `Cmd + K` (macOS), or go to `Git > Commit...`.
2. In the Commit window:
   - Select the changed files.
   - Add a clear commit message (e.g., `Finish Exercise 1`).
   - Click **Commit** or **Commit and Push**.

---

## 🚀 Step 7: Push to GitHub

If you only committed (but didn’t push):

1. Press `Ctrl + Shift + K` (Windows/Linux) or `Cmd + Shift + K` (macOS).
2. Confirm the push in the dialog.

Check your repository on GitHub to see your updated files.

---

## ✅ Step 8: Submit Your Work

- Copy the link to your GitHub repository.
- Submit it to your instructor using the required platform.

---

## 🧠 Tips

- Commit regularly with descriptive messages:  
  ✅ `Implement customer login`  
  ❌ `stuff`
- Don’t commit generated files (IDEA will use `.gitignore` to help).
- You can learn branches later — starting with `main` is totally fine.

---
