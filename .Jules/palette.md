## 2026-07-14 - Non-standard PascalCase in Backend Methods
**Learning:** The `EtudiantBean` uses `AddEtudiant` (PascalCase) instead of the standard `addEtudiant` (camelCase). JSF Expression Language is case-sensitive for method references, so matching the Java declaration exactly is critical to avoid `MethodNotFoundException`.
**Action:** Always verify the exact method name in the Java source file before updating JSF action attributes in this project.

## 2026-07-14 - CRLF Line Endings in Legacy XHTML
**Learning:** Legacy files in this repository use CRLF line endings, which causes `replace_with_git_merge_diff` to fail if the search block doesn't match the line endings exactly. Global normalization can exceed the 50-line PR limit.
**Action:** Use `sed -i 's/\r//' <file>` to normalize a file before patching, or use surgical `sed` commands to minimize the diff size for PR compliance.
