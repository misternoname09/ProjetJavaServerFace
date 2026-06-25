## 2026-06-25 - [Accessibility & Functional Fixes in JSF]
**Learning:** JSF Expression Language (EL) is case-sensitive for method references (e.g., `AddEtudiant` vs `addEtudiant`). In legacy projects, fixing functional bugs that block UX (like broken table variables) is a high-impact micro-UX win. Accessibility attributes like `a:aria-label` are essential for icon-less or generic action links in data tables.
**Action:** Always verify Java method names exactly when fixing JSF actions. Use minimal SEARCH/REPLACE blocks to respect line limits and avoid unnecessary file rewrites.
