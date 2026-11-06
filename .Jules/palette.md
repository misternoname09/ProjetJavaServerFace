# Palette's Journal - UX & Accessibility Learnings

## 2026-11-06 - Inline Confirmation JS Escaping and Button Tooltips
**Learning:** In JSF/PrimeFaces XHTML attributes, inline JavaScript confirmation dialogs containing unescaped apostrophes (e.g. `onclick="if(! confirm('voulez-vous supprimer l'etudiant')) return false;"`) trigger a JavaScript SyntaxError at runtime, breaking the confirmation workflow and blocking user interaction. Furthermore, standard JSF action components natively support the `title` attribute for accessible tooltips and screen reader descriptions.
**Action:** Phrasing confirmation messages using demonstratives (e.g. `cet étudiant`) prevents single-quote syntax errors in inline JavaScript handlers, and providing descriptive `title` attributes on interactive elements improves mouse hover affordance and screen reader accessibility.
