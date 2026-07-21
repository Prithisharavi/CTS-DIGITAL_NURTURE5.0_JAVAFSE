# Git HOL - Branching and Merging

## Objective
To learn Git branching and merging by creating a new branch, making changes, merging it into the main branch, and deleting the branch.

## Steps Performed
- Created a new branch named `GitNewBranch`
- Switched to the new branch
- Created `branchfile.txt`
- Added sample content
- Committed the changes
- Switched back to the `main` branch
- Compared branches using Git DiffTool (P4Merge)
- Merged the branch into `main`
- Viewed commit history using:
  ```bash
  git log --oneline --graph --decorate
  ```
- Deleted the merged branch
- Verified the working tree is clean

## Commands Used

```bash
git checkout -b GitNewBranch
git branch -a
echo "Welcome to Git Branching and Merging" > branchfile.txt
git add .
git commit -m "Added branchfile in GitNewBranch"
git checkout main
git difftool main GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git status
```

## Result

Successfully performed Git branching, merging, branch comparison using P4Merge, and branch deletion.