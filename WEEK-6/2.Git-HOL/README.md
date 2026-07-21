# Git HOL - Exercise 2: Git Ignore

## Objective

To understand and implement `.gitignore` in Git to ignore unwanted files and folders from being tracked by the Git repository.

## Exercise Details

In this exercise:

- Created a `.log` file.
- Created a `log` folder.
- Created and configured a `.gitignore` file.
- Added rules to ignore `.log` files and the `log` folder.
- Verified ignored files using `git status`.

## Git Ignore Configuration

The following rules were added to the `.gitignore` file:

*.log
log/

## Commands Used

git status  
git add .  
git commit -m "Completed Git HOL Exercise 2 - Git Ignore"  
git push origin main  

## Result

The `.gitignore` file was successfully configured.

The `.log` files and `log` folder were ignored by Git and were not tracked or committed to the repository.

## Conclusion

Successfully learned how to use `.gitignore` to prevent unwanted files and folders from being tracked by Git.