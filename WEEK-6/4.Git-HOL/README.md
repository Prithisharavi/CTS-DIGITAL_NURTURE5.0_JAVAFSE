# Git HOL 4 – Merge Conflict Resolution

## Objective
To understand and implement Git merge conflict resolution using branches and the P4Merge tool.

## Software Used
- Git Bash
- Git
- P4Merge
- VS Code

## Steps Performed

1. Initialized a Git repository.
2. Created the initial commit on the master branch.
3. Created a new branch named `GitWork`.
4. Modified `hello.xml` in the `GitWork` branch and committed the changes.
5. Switched back to the `master` branch.
6. Modified the same file with different content and committed the changes.
7. Compared branch differences using:
   - `git log --oneline --graph --decorate --all`
   - `git difftool`
8. Used P4Merge to visualize the differences.
9. Merged `GitWork` into `master`.
10. Resolved the merge conflict using P4Merge.
11. Committed the resolved merge.
12. Added `*.orig` to `.gitignore`.
13. Committed the `.gitignore` file.
14. Deleted the merged branch.
15. Verified the final Git history.

## Commands Used

```bash
git init
git checkout -b GitWork
git add hello.xml
git commit -m "Initial commit on master"
git commit -m "Updated hello.xml in GitWork"
git checkout master
git difftool
git mergetool
git merge GitWork
git add hello.xml
git commit -m "Resolved merge conflict"
echo "*.orig" >> .gitignore
git add .gitignore
git commit -m "Added .gitignore"
git branch
git branch -d GitWork
git log --oneline --graph --decorate