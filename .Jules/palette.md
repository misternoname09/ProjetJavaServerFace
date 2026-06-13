## 2024-06-13 - [Accessibility and Validation in Legacy JSF]
**Learning:** Legacy JSF applications often lack basic accessibility (missing labels, ARIA) and inline validation feedback. Using `p:panelGrid columns="3"` with `p:outputLabel for="..."` and `p:message for="..."` provides a clean, accessible layout for forms.
**Action:** Always link labels to inputs and add inline message components for every form field.

## 2024-06-13 - [Handling Truncated File Reads]
**Learning:** In this sandbox environment, `read_file` and `run_in_bash_session` output can be truncated at 1000 characters. For legacy files that are often large, this leads to incomplete context and failed plan reviews.
**Action:** Read large files in segments using `sed -n 'X,Yp' filepath` to ensure all relevant code is visible in the trace before proposing changes.

## 2024-06-13 - [Line Ending Sensitivity]
**Learning:** Files in legacy Java Dynamic Web Projects may have Windows-style CRLF line endings, which cause `replace_with_git_merge_diff` to fail when search blocks use LF.
**Action:** Use `sed -i 's/\r//' filepath` to normalize line endings to LF before attempting to apply patches.
